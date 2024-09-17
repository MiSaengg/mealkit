import React, { useState } from 'react';

type EditSaveProps = {
    type: string;
    value: string;
    onChange: (value: string) => void;
    placeholder?: string;
};

const StoreManageEditSave = ({ type, value, onChange, placeholder }: EditSaveProps) => {
    const [isReadOnly, setIsReadOnly] = useState(true);

    const toggleReadOnly = () => {
        setIsReadOnly(!isReadOnly);
    };

    return (
        <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
            <input
                type={type}
                required
                readOnly={isReadOnly}
                value={value}
                onChange={(e) => onChange(e.target.value)}
                placeholder={placeholder || `Enter your ${type}`}
                style={{ flexGrow: 1 }}
            />
            <button type="button" onClick={toggleReadOnly} style={{ marginLeft: '10px' }}>
                {isReadOnly ? 'Edit' : 'Save'}
            </button>
        </div>
    );
};

export default StoreManageEditSave;
