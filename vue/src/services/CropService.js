import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8080"
});

export default {

  listAllCropsForUser(userId) {
    return http.get(`/home/mycrops?userId=${userId}`)
  },

  listCropsForOnePlot() {
    return http.get('/plot/myplot')
  }

}