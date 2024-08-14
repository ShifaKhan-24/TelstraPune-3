FROM nginx  
RUN rm /usr/share/nginx/html/*   
COPY index.html /usr/share/nginx/html/
the directory of nginx server
