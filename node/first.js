import fs from 'fs';

fs.readFile('s.txt','utf-8',(error,txt)=>{
    console.log(error)
    console.log(txt)
})