import React from "react";
import './style.css';

function Card() {
    return (
        <li className="card-item">
            <a className="card-link" title="Damn Demonic Swords" href="https://www.mangageko.com/manga/damn-demonic-swords/">
                <div className="card-background-image" style={{ backgroundImage: 'url("https://images.novel-fast.club/avatar/288x412/media/manga_covers/damn-magic-swords.jpg")' }}>
                    <span className="status">New</span>
                    <h4 className="novel-title">
                        Damn Demonic Swords
                    </h4>
                </div>
            </a>
        </li>
    );
}

export default Card;
