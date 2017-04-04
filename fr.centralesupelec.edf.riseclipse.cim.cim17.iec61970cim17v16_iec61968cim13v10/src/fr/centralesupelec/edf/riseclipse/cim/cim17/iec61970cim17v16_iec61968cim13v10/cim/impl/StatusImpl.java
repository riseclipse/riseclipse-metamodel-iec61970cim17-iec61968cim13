/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StatusImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StatusImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StatusImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StatusImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusImpl extends MinimalEObjectImpl.Container implements Status {
    /**
     * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTime()
     * @generated
     * @ordered
     */
    protected static final Date DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTime()
     * @generated
     * @ordered
     */
    protected Date dateTime = DATE_TIME_EDEFAULT;

    /**
     * This is true if the Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dateTimeESet;

    /**
     * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected static final String REASON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected String reason = REASON_EDEFAULT;

    /**
     * This is true if the Reason attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reasonESet;

    /**
     * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemark()
     * @generated
     * @ordered
     */
    protected static final String REMARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemark()
     * @generated
     * @ordered
     */
    protected String remark = REMARK_EDEFAULT;

    /**
     * This is true if the Remark attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remarkESet;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatusImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStatus();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDateTime( Date newDateTime ) {
        Date oldDateTime = dateTime;
        dateTime = newDateTime;
        boolean oldDateTimeESet = dateTimeESet;
        dateTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STATUS__DATE_TIME, oldDateTime, dateTime, !oldDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDateTime() {
        Date oldDateTime = dateTime;
        boolean oldDateTimeESet = dateTimeESet;
        dateTime = DATE_TIME_EDEFAULT;
        dateTimeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STATUS__DATE_TIME, oldDateTime, DATE_TIME_EDEFAULT, oldDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDateTime() {
        return dateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReason() {
        return reason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReason( String newReason ) {
        String oldReason = reason;
        reason = newReason;
        boolean oldReasonESet = reasonESet;
        reasonESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATUS__REASON,
                oldReason, reason, !oldReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReason() {
        String oldReason = reason;
        boolean oldReasonESet = reasonESet;
        reason = REASON_EDEFAULT;
        reasonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STATUS__REASON, oldReason, REASON_EDEFAULT, oldReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReason() {
        return reasonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRemark() {
        return remark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemark( String newRemark ) {
        String oldRemark = remark;
        remark = newRemark;
        boolean oldRemarkESet = remarkESet;
        remarkESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATUS__REMARK,
                oldRemark, remark, !oldRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemark() {
        String oldRemark = remark;
        boolean oldRemarkESet = remarkESet;
        remark = REMARK_EDEFAULT;
        remarkESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STATUS__REMARK, oldRemark, REMARK_EDEFAULT, oldRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemark() {
        return remarkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( String newValue ) {
        String oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATUS__VALUE,
                oldValue, value, !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        String oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STATUS__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.STATUS__DATE_TIME:
            return getDateTime();
        case CimPackage.STATUS__REASON:
            return getReason();
        case CimPackage.STATUS__REMARK:
            return getRemark();
        case CimPackage.STATUS__VALUE:
            return getValue();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.STATUS__DATE_TIME:
            setDateTime( ( Date ) newValue );
            return;
        case CimPackage.STATUS__REASON:
            setReason( ( String ) newValue );
            return;
        case CimPackage.STATUS__REMARK:
            setRemark( ( String ) newValue );
            return;
        case CimPackage.STATUS__VALUE:
            setValue( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.STATUS__DATE_TIME:
            unsetDateTime();
            return;
        case CimPackage.STATUS__REASON:
            unsetReason();
            return;
        case CimPackage.STATUS__REMARK:
            unsetRemark();
            return;
        case CimPackage.STATUS__VALUE:
            unsetValue();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.STATUS__DATE_TIME:
            return isSetDateTime();
        case CimPackage.STATUS__REASON:
            return isSetReason();
        case CimPackage.STATUS__REMARK:
            return isSetRemark();
        case CimPackage.STATUS__VALUE:
            return isSetValue();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (dateTime: " );
        if( dateTimeESet )
            result.append( dateTime );
        else
            result.append( "<unset>" );
        result.append( ", reason: " );
        if( reasonESet )
            result.append( reason );
        else
            result.append( "<unset>" );
        result.append( ", remark: " );
        if( remarkESet )
            result.append( remark );
        else
            result.append( "<unset>" );
        result.append( ", value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StatusImpl
