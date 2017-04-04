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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LineDetail;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LineDetailImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LineDetailImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LineDetailImpl#getNote <em>Note</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LineDetailImpl#getRounding <em>Rounding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineDetailImpl extends MinimalEObjectImpl.Container implements LineDetail {
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
     * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected static final String NOTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected String note = NOTE_EDEFAULT;

    /**
     * This is true if the Note attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean noteESet;

    /**
     * The default value of the '{@link #getRounding() <em>Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRounding()
     * @generated
     * @ordered
     */
    protected static final BigDecimal ROUNDING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRounding() <em>Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRounding()
     * @generated
     * @ordered
     */
    protected BigDecimal rounding = ROUNDING_EDEFAULT;

    /**
     * This is true if the Rounding attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean roundingESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LineDetailImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLineDetail();
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
                CimPackage.LINE_DETAIL__AMOUNT, oldAmount, amount, !oldAmountESet ) );
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
                CimPackage.LINE_DETAIL__AMOUNT, oldAmount, AMOUNT_EDEFAULT, oldAmountESet ) );
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
                CimPackage.LINE_DETAIL__DATE_TIME, oldDateTime, dateTime, !oldDateTimeESet ) );
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
                CimPackage.LINE_DETAIL__DATE_TIME, oldDateTime, DATE_TIME_EDEFAULT, oldDateTimeESet ) );
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
    public String getNote() {
        return note;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNote( String newNote ) {
        String oldNote = note;
        note = newNote;
        boolean oldNoteESet = noteESet;
        noteESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LINE_DETAIL__NOTE, oldNote, note, !oldNoteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNote() {
        String oldNote = note;
        boolean oldNoteESet = noteESet;
        note = NOTE_EDEFAULT;
        noteESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LINE_DETAIL__NOTE, oldNote, NOTE_EDEFAULT, oldNoteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNote() {
        return noteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getRounding() {
        return rounding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRounding( BigDecimal newRounding ) {
        BigDecimal oldRounding = rounding;
        rounding = newRounding;
        boolean oldRoundingESet = roundingESet;
        roundingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LINE_DETAIL__ROUNDING, oldRounding, rounding, !oldRoundingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRounding() {
        BigDecimal oldRounding = rounding;
        boolean oldRoundingESet = roundingESet;
        rounding = ROUNDING_EDEFAULT;
        roundingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LINE_DETAIL__ROUNDING, oldRounding, ROUNDING_EDEFAULT, oldRoundingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRounding() {
        return roundingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LINE_DETAIL__AMOUNT:
            return getAmount();
        case CimPackage.LINE_DETAIL__DATE_TIME:
            return getDateTime();
        case CimPackage.LINE_DETAIL__NOTE:
            return getNote();
        case CimPackage.LINE_DETAIL__ROUNDING:
            return getRounding();
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
        case CimPackage.LINE_DETAIL__AMOUNT:
            setAmount( ( BigDecimal ) newValue );
            return;
        case CimPackage.LINE_DETAIL__DATE_TIME:
            setDateTime( ( Date ) newValue );
            return;
        case CimPackage.LINE_DETAIL__NOTE:
            setNote( ( String ) newValue );
            return;
        case CimPackage.LINE_DETAIL__ROUNDING:
            setRounding( ( BigDecimal ) newValue );
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
        case CimPackage.LINE_DETAIL__AMOUNT:
            unsetAmount();
            return;
        case CimPackage.LINE_DETAIL__DATE_TIME:
            unsetDateTime();
            return;
        case CimPackage.LINE_DETAIL__NOTE:
            unsetNote();
            return;
        case CimPackage.LINE_DETAIL__ROUNDING:
            unsetRounding();
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
        case CimPackage.LINE_DETAIL__AMOUNT:
            return isSetAmount();
        case CimPackage.LINE_DETAIL__DATE_TIME:
            return isSetDateTime();
        case CimPackage.LINE_DETAIL__NOTE:
            return isSetNote();
        case CimPackage.LINE_DETAIL__ROUNDING:
            return isSetRounding();
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
        result.append( ", note: " );
        if( noteESet )
            result.append( note );
        else
            result.append( "<unset>" );
        result.append( ", rounding: " );
        if( roundingESet )
            result.append( rounding );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LineDetailImpl
