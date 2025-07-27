# 🚌 Dynamic Route Rationalization System

A full-stack smart route optimization system that uses Google Maps API, machine learning prediction, and live traffic data to dynamically suggest optimal bus routes for urban transport, built for DTC hackathon.

---

## 🌐 Live Features

- 📍 Route calculation with **live traffic conditions**
- 🔀 Multiple alternative routes sorted by distance + traffic severity
- 🎯 ML model-based **duration prediction** using `scikit-learn`
- 🧠 Visual map controls: traffic layers, map type toggle, zoom
- 🚌 Real-time bus stop markers on the map

---

## 🧱 Tech Stack

| Layer      | Tools/Techs                             |
|------------|------------------------------------------|
| Backend    | Python, Flask, `joblib`, scikit-learn   |
| Frontend   | HTML, CSS, JavaScript, Google Maps API  |
| ML Model   | Trained with traffic duration features  |
| Hosting    | Localhost (Flask), deployable to Render/Heroku |

---

## 📁 Folder Structure

📦 dynamic-route-rationalization/
├── app.py # Flask backend
├── duration_predictor_model.joblib
├── templates/
│ └── index.html # Main UI
├── static/
│ ├── styles.css # UI styling
│ ├── scripts.js # Map & route logic
│ └── busMarkers.js # Bus location markers


---

## 🔧 Getting Started

### Prerequisites

- Python 3.9+
- Google Maps API key (enabled for Maps + Places + Directions)
- Install dependencies:

```bash
pip install flask scikit-learn joblib
