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

7.1. Run mlflow server hdfs artifact
```
(venvspark) [train@localhost mlflow]$ mlflow server \
--backend-store-uri postgresql+psycopg2://train:Ankara06@localhost:5432/mlflow \
--default-artifact-root hdfs://localhost:9000/user/train/mlflow \
--host 0.0.0.0  2> mlflow_server.log &
```

7.2. Run mlflow server amazon s3 artifact
Create train-mlflow bucket on your s3 instance
export AWS_ACCESS_KEY_ID=xxxxxx
export AWS_SECRET_ACCESS_KEY=xxxx
```
(venvspark) [train@localhost mlflow]$ mlflow server \
--backend-store-uri postgresql+psycopg2://train:Ankara06@localhost:5432/mlflow \
--default-artifact-root s3://train-mlflow/homecredit \
--host 0.0.0.0  2> mlflow_server.log &
```
8. See the postgresql tables are created.

```
postgres=# \c mlflow
psql (9.2.24, server 10.13)
WARNING: psql version 9.2, server version 10.0.
         Some psql features might not work.
You are now connected to database "mlflow" as user "postgres".
mlflow=# \dt
               List of relations
 Schema |         Name          | Type  | Owner
--------+-----------------------+-------+-------
 public | alembic_version       | table | train
 public | experiment_tags       | table | train
 public | experiments           | table | train
 public | latest_metrics        | table | train
 public | metrics               | table | train
 public | model_version_tags    | table | train
 public | model_versions        | table | train
 public | params                | table | train
 public | registered_model_tags | table | train
 public | registered_models     | table | train
 public | runs                  | table | train
 public | tags                  | table | train
(12 rows)
```

9. Open browser and enter [http://localhost:5000/](http://localhost:5000/)

10. Stop mlflow server
` ps -A | grep gunicorn `
` pkill -f gunicorn `








References:

[Mlflow HDFS Artifact] (https://medium.com/@moyukh_51433/mlflow-storing-artifacts-in-hdfs-and-in-an-sqlite-db-7be26971b6ab)
