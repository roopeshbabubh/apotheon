import React from "react";
import Card from "./Card";

function CardBox() {
    return (
        <section className="cards-container">
            <div className="cardbox-header">
                <h3>Manga</h3>
                <p>Freshly added manga by website.</p>
            </div>
            <ul className="cards-list">
                <Card />
                <Card />
                <Card />
                <Card />
                <Card />
                <Card />
                <Card />
                <Card />
            </ul>
        </section>
    );
}

export default CardBox;