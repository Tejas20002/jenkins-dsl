// const fetch = require('node-fetch');
// const express = require('express');
import fetch from 'node-fetch';
import express from 'express';

const app = express();
const port = 3000;

app.use(express.static('public'));

app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});

app.get('/:places', async(req, rep) => {
    //run code stuff
    const places = req.params.places;
    const api = await fetch(`http://api.weatherapi.com/v1/current.json?key=11703676ed6f4545b5a84959210812&q=${places}&aqi=no`, {
        "method": "GET"
    });

    //convert promise into json
    const weat = await api.json();
    //console.log(playstore);
    rep.json(weat);
});
