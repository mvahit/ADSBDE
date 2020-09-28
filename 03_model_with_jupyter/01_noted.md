1. Activate virtual environment  

```
[train@localhost 03_model_with_spark]$ source ~/venvspark/bin/activate
(venvspark) [train@localhost 03_model_with_spark]$
```

2. Open jupyter notebook  
`(venvspark) [train@localhost 03_model_with_spark]$ jupyter notebook 2> /dev/null & `
or if you want to tail logs
` (venvspark) [train@localhost 03_model_with_jupyter]$ jupyter notebook 2> jupyter.logs & `
tail logs
` (venvspark) [train@localhost 03_model_with_jupyter]$ tail -f jupyter.logs `



3. Stop Jupyter notebook
Save your notebook then:
```
(venvspark) [train@localhost 03_model_with_spark]$ jupyter notebook stop

Shutting down server on port 8888 ...
[1]+  Done                    jupyter notebook 2> /dev/null
```

4. Check if any notebook is running, list notebooks
```
(venvspark) [train@localhost 03_model_with_spark]$ jupyter notebook list
Currently running servers:
http://localhost:8888/?token=28b376fb7449caed874096c1f33e34f8c0355c104f640c3c :: /home/train/advanced_ds_bigdata/03_model_with_spark
```

5. Deactivate vrtual environment
From any directory just `deactivate`

