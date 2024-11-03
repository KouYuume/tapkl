rm ./build/terraform/main.tf.json
pkl eval -f json main.pkl -o build/terraform/main.tf.json

sed -i '' 's/"null"/null/g' "./build/terraform/main.tf.json"

docker compose run --rm terraform apply