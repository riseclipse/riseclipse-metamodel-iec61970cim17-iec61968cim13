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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountMovement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Movement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountMovementImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountMovementImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountMovementImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountMovementImpl extends MinimalEObjectImpl.Container implements AccountMovement {
    /**
     * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmount()
     * @generated
     * @ordered
     */
    protected static final BigDecimal AMOUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmount()
     * @generated
     * @ordered
     */
    protected BigDecimal amount = AMOUNT_EDEFAULT;

    /**
     * This is true if the Amount attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean amountESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccountMovementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccountMovement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAmount( BigDecimal newAmount ) {
        BigDecimal oldAmount = amount;
        amount = newAmount;
        boolean oldAmountESet = amountESet;
        amountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNT_MOVEMENT__AMOUNT, oldAmount, amount, !oldAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAmount() {
        BigDecimal oldAmount = amount;
        boolean oldAmountESet = amountESet;
        amount = AMOUNT_EDEFAULT;
        amountESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCOUNT_MOVEMENT__AMOUNT, oldAmount, AMOUNT_EDEFAULT, oldAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAmount() {
        return amountESet;
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
                CimPackage.ACCOUNT_MOVEMENT__DATE_TIME, oldDateTime, dateTime, !oldDateTimeESet ) );
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
                CimPackage.ACCOUNT_MOVEMENT__DATE_TIME, oldDateTime, DATE_TIME_EDEFAULT, oldDateTimeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNT_MOVEMENT__REASON, oldReason, reason, !oldReasonESet ) );
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
                CimPackage.ACCOUNT_MOVEMENT__REASON, oldReason, REASON_EDEFAULT, oldReasonESet ) );
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ACCOUNT_MOVEMENT__AMOUNT:
            return getAmount();
        case CimPackage.ACCOUNT_MOVEMENT__DATE_TIME:
            return getDateTime();
        case CimPackage.ACCOUNT_MOVEMENT__REASON:
            return getReason();
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
        case CimPackage.ACCOUNT_MOVEMENT__AMOUNT:
            setAmount( ( BigDecimal ) newValue );
            return;
        case CimPackage.ACCOUNT_MOVEMENT__DATE_TIME:
            setDateTime( ( Date ) newValue );
            return;
        case CimPackage.ACCOUNT_MOVEMENT__REASON:
            setReason( ( String ) newValue );
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
        case CimPackage.ACCOUNT_MOVEMENT__AMOUNT:
            unsetAmount();
            return;
        case CimPackage.ACCOUNT_MOVEMENT__DATE_TIME:
            unsetDateTime();
            return;
        case CimPackage.ACCOUNT_MOVEMENT__REASON:
            unsetReason();
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
        case CimPackage.ACCOUNT_MOVEMENT__AMOUNT:
            return isSetAmount();
        case CimPackage.ACCOUNT_MOVEMENT__DATE_TIME:
            return isSetDateTime();
        case CimPackage.ACCOUNT_MOVEMENT__REASON:
            return isSetReason();
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (amount: " );
        if( amountESet )
            result.append( amount );
        else
            result.append( "<unset>" );
        result.append( ", dateTime: " );
        if( dateTimeESet )
            result.append( dateTime );
        else
            result.append( "<unset>" );
        result.append( ", reason: " );
        if( reasonESet )
            result.append( reason );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AccountMovementImpl
