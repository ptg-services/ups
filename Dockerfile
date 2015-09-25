FROM hshira/mule:3.7
# copy the compiled artifact and drop in mule/apps folder
COPY target/ups.zip /opt/mule/apps/ups.zip
