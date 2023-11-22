import React from 'react';

const StoreIcon: React.FC = () => {
    return (
        <div style={{ width: '40px', height: '40px', background: 'gray', borderRadius: '50%', marginRight: '10px' }}></div>
    );
}

export default StoreIcon;


/*
import React, { useEffect, useState } from 'react';
import axios from 'axios';

const StoreIcon: React.FC = () => {
    const [imageUrl, setImageUrl] = useState<string>('');

    useEffect(() => {
        // 실제 API 엔드포인트로 교체해야 합니다.
        const apiEndpoint = 'https://your-api-endpoint.com/get-store-icon';

        axios.get(apiEndpoint)
            .then(response => {
                // response.data에 이미지 URL이 포함되어 있다고 가정합니다.
                // 실제 응답 구조에 따라 코드를 조정해야 합니다.
                setImageUrl(response.data.imageUrl);
            })
            .catch(error => {
                console.error('Error fetching the store icon:', error);
            });
    }, []); // useEffect의 dependency 배열이 비어 있으므로, 컴포넌트가 마운트될 때 한 번만 API 호출이 실행됩니다.

    return (
        <div style={{ width: '40px', height: '40px', background: `url(${imageUrl}) no-repeat center/cover`, borderRadius: '50%', marginRight: '10px' }}></div>
    );
}

export default StoreIcon;
*/