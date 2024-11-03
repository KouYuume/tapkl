# Summary
This repository generates and applies Terraform (JSON) files for building AWS environments using Apple's programming language Pkl.

# Sample
```pkl
// Create pkl file in tfObjects directory.
import ".../packages/aws/vpc/VPC.pkl"

vpc: VPC = new {
  tfName = "kaza_test_dev_vpc"
  cidr_block = "10.0.0.0/16"
  tags {
    ["Name"] = "kaza_test_dev_vpc"
  }
}
```

# Command
```bash
# terraform init
docker compose run --rm terraform init

# pkl eval && terraform apply
sh build.sh

# terraform destroy
sh destroy.sh
```