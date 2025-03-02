# 

## Model
www.msaez.io/#/487999/storming/fish-distribution-erp-system

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- supply-chain-management
- production-management
- product-management
- financial-management


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- supply-chain-management
```
 http :8088/supplierRegistrations supplierId="supplierId" supplierName="supplierName" 
 http :8088/fishPurchasePlans planId="planId" 
 http :8088/fishOrders orderId="orderId" fishId="fishId" quantity="quantity" orderStatus="orderStatus" 
 http :8088/stocks stockId="stockId" fishId="fishId" quantity="quantity" 
```
- production-management
```
 http :8088/harvestInformations harvestId="harvestId" fishId="fishId" quantity="quantity" 
 http :8088/fishProductionPlans planId="planId" 
 http :8088/fishProductionStatuses statusId="statusId" productionId="productionId" status="status" 
```
- product-management
```
 http :8088/products productId="productId" productName="productName" 
 http :8088/productOrders orderId="orderId" productId="productId" quantity="quantity" orderStatus="orderStatus" 
 http :8088/productSales saleId="saleId" productId="productId" quantity="quantity" 
```
- financial-management
```
 http :8088/payments paymentId="paymentId" orderId="orderId" amount="amount" 
 http :8088/accountings accountId="accountId" data="data" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

