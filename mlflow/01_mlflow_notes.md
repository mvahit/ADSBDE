# mlflow installation
1. Install dependencies of psycopg2 package
```
sudo yum groupinstall "Development Tools"
sudo yum install python3-devel
sudo yum install postgresql-libs
sudo yum install postgresql-devel
pip install psycopg2
```
2. Hadoop services mut be running start-all.sh

3. Activate virtual environment
` source ~/venvspark/bin/activate `

4. install mlflow with pip
`  pip install mlflow  `

5. Prepare postgresql as backend store
` CREATE DATABASE mlflow OWNER train ENCODING 'UTF8'; `

6. Artifact store as HDFS
` hdfs dfs -mkdir /user/train/mlflow `

7. Run mlflow server
` (venvspark) [train@localhost mlflow]$ mlflow server --backend-store-uri postgresql+psycopg2://train:Ankara06@localhost:5432/mlflow --default-artifact-root hdfs://localhost:9000/mlflow --host 0.0.0.0 `

8. Open browser and enter [a link](http://localhost:5000/)

