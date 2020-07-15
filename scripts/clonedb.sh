folder_path="/home/naggar/Desktop/Flairstech/dummy"
rm -rf "$folder_path"
mkdir "$folder_path"
chmod -R 777 $folder_path
git clone https://github.com/ghusta/docker-postgres-world-db.git $folder_path
docker container list | grep flairs_db | awk '{print $1}' | xargs -I {} docker stop {}
docker ps -a | grep ghusta/postgres-world-db:2.4 | awk '{print $1}' | xargs -I {} docker rm {}
docker ps -a | grep flairs_db | awk '{print $1}' | xargs -I {} docker rm {}
docker rmi flairs_db
cd "$folder_path"
docker build -f Dockerfile -t flairs_db .
docker run -d -p 8081:5432 flairs_db
