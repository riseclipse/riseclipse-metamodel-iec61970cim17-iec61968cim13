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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tender;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CardImpl#getAccountHolderName <em>Account Holder Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CardImpl#getCvNumber <em>Cv Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CardImpl#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CardImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CardImpl#getTender <em>Tender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends CimObjectWithIDImpl implements Card {
    /**
     * The default value of the '{@link #getAccountHolderName() <em>Account Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccountHolderName()
     * @generated
     * @ordered
     */
    protected static final String ACCOUNT_HOLDER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccountHolderName() <em>Account Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccountHolderName()
     * @generated
     * @ordered
     */
    protected String accountHolderName = ACCOUNT_HOLDER_NAME_EDEFAULT;

    /**
     * This is true if the Account Holder Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accountHolderNameESet;

    /**
     * The default value of the '{@link #getCvNumber() <em>Cv Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCvNumber()
     * @generated
     * @ordered
     */
    protected static final String CV_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCvNumber() <em>Cv Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCvNumber()
     * @generated
     * @ordered
     */
    protected String cvNumber = CV_NUMBER_EDEFAULT;

    /**
     * This is true if the Cv Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cvNumberESet;

    /**
     * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpiryDate()
     * @generated
     * @ordered
     */
    protected static final Date EXPIRY_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpiryDate()
     * @generated
     * @ordered
     */
    protected Date expiryDate = EXPIRY_DATE_EDEFAULT;

    /**
     * This is true if the Expiry Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean expiryDateESet;

    /**
     * The default value of the '{@link #getPan() <em>Pan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPan()
     * @generated
     * @ordered
     */
    protected static final String PAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPan() <em>Pan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPan()
     * @generated
     * @ordered
     */
    protected String pan = PAN_EDEFAULT;

    /**
     * This is true if the Pan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean panESet;

    /**
     * The cached value of the '{@link #getTender() <em>Tender</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTender()
     * @generated
     * @ordered
     */
    protected Tender tender;

    /**
     * This is true if the Tender reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tenderESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCard();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccountHolderName( String newAccountHolderName ) {
        String oldAccountHolderName = accountHolderName;
        accountHolderName = newAccountHolderName;
        boolean oldAccountHolderNameESet = accountHolderNameESet;
        accountHolderNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CARD__ACCOUNT_HOLDER_NAME,
                    oldAccountHolderName, accountHolderName, !oldAccountHolderNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccountHolderName() {
        String oldAccountHolderName = accountHolderName;
        boolean oldAccountHolderNameESet = accountHolderNameESet;
        accountHolderName = ACCOUNT_HOLDER_NAME_EDEFAULT;
        accountHolderNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CARD__ACCOUNT_HOLDER_NAME,
                    oldAccountHolderName, ACCOUNT_HOLDER_NAME_EDEFAULT, oldAccountHolderNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccountHolderName() {
        return accountHolderNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCvNumber() {
        return cvNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCvNumber( String newCvNumber ) {
        String oldCvNumber = cvNumber;
        cvNumber = newCvNumber;
        boolean oldCvNumberESet = cvNumberESet;
        cvNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CARD__CV_NUMBER, oldCvNumber, cvNumber, !oldCvNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCvNumber() {
        String oldCvNumber = cvNumber;
        boolean oldCvNumberESet = cvNumberESet;
        cvNumber = CV_NUMBER_EDEFAULT;
        cvNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CARD__CV_NUMBER, oldCvNumber, CV_NUMBER_EDEFAULT, oldCvNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCvNumber() {
        return cvNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpiryDate( Date newExpiryDate ) {
        Date oldExpiryDate = expiryDate;
        expiryDate = newExpiryDate;
        boolean oldExpiryDateESet = expiryDateESet;
        expiryDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CARD__EXPIRY_DATE, oldExpiryDate, expiryDate, !oldExpiryDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExpiryDate() {
        Date oldExpiryDate = expiryDate;
        boolean oldExpiryDateESet = expiryDateESet;
        expiryDate = EXPIRY_DATE_EDEFAULT;
        expiryDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CARD__EXPIRY_DATE, oldExpiryDate, EXPIRY_DATE_EDEFAULT, oldExpiryDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExpiryDate() {
        return expiryDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPan() {
        return pan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPan( String newPan ) {
        String oldPan = pan;
        pan = newPan;
        boolean oldPanESet = panESet;
        panESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CARD__PAN, oldPan, pan, !oldPanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPan() {
        String oldPan = pan;
        boolean oldPanESet = panESet;
        pan = PAN_EDEFAULT;
        panESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CARD__PAN,
                oldPan, PAN_EDEFAULT, oldPanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPan() {
        return panESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tender getTender() {
        if( tender != null && tender.eIsProxy() ) {
            InternalEObject oldTender = ( InternalEObject ) tender;
            tender = ( Tender ) eResolveProxy( oldTender );
            if( tender != oldTender ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.CARD__TENDER, oldTender, tender ) );
            }
        }
        return tender;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Tender basicGetTender() {
        return tender;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTender( Tender newTender, NotificationChain msgs ) {
        Tender oldTender = tender;
        tender = newTender;
        boolean oldTenderESet = tenderESet;
        tenderESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.CARD__TENDER,
                    oldTender, newTender, !oldTenderESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTender( Tender newTender ) {
        if( newTender != tender ) {
            NotificationChain msgs = null;
            if( tender != null ) msgs = ( ( InternalEObject ) tender ).eInverseRemove( this, CimPackage.TENDER__CARD,
                    Tender.class, msgs );
            if( newTender != null ) msgs = ( ( InternalEObject ) newTender ).eInverseAdd( this, CimPackage.TENDER__CARD,
                    Tender.class, msgs );
            msgs = basicSetTender( newTender, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTenderESet = tenderESet;
            tenderESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CARD__TENDER, newTender, newTender, !oldTenderESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTender( NotificationChain msgs ) {
        Tender oldTender = tender;
        tender = null;
        boolean oldTenderESet = tenderESet;
        tenderESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.CARD__TENDER,
                    oldTender, null, oldTenderESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTender() {
        if( tender != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) tender ).eInverseRemove( this, CimPackage.TENDER__CARD, Tender.class, msgs );
            msgs = basicUnsetTender( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTenderESet = tenderESet;
            tenderESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CARD__TENDER, null, null, oldTenderESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTender() {
        return tenderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CARD__TENDER:
            if( tender != null ) msgs = ( ( InternalEObject ) tender ).eInverseRemove( this, CimPackage.TENDER__CARD,
                    Tender.class, msgs );
            return basicSetTender( ( Tender ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CARD__TENDER:
            return basicUnsetTender( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CARD__ACCOUNT_HOLDER_NAME:
            return getAccountHolderName();
        case CimPackage.CARD__CV_NUMBER:
            return getCvNumber();
        case CimPackage.CARD__EXPIRY_DATE:
            return getExpiryDate();
        case CimPackage.CARD__PAN:
            return getPan();
        case CimPackage.CARD__TENDER:
            if( resolve ) return getTender();
            return basicGetTender();
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
        case CimPackage.CARD__ACCOUNT_HOLDER_NAME:
            setAccountHolderName( ( String ) newValue );
            return;
        case CimPackage.CARD__CV_NUMBER:
            setCvNumber( ( String ) newValue );
            return;
        case CimPackage.CARD__EXPIRY_DATE:
            setExpiryDate( ( Date ) newValue );
            return;
        case CimPackage.CARD__PAN:
            setPan( ( String ) newValue );
            return;
        case CimPackage.CARD__TENDER:
            setTender( ( Tender ) newValue );
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
        case CimPackage.CARD__ACCOUNT_HOLDER_NAME:
            unsetAccountHolderName();
            return;
        case CimPackage.CARD__CV_NUMBER:
            unsetCvNumber();
            return;
        case CimPackage.CARD__EXPIRY_DATE:
            unsetExpiryDate();
            return;
        case CimPackage.CARD__PAN:
            unsetPan();
            return;
        case CimPackage.CARD__TENDER:
            unsetTender();
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
        case CimPackage.CARD__ACCOUNT_HOLDER_NAME:
            return isSetAccountHolderName();
        case CimPackage.CARD__CV_NUMBER:
            return isSetCvNumber();
        case CimPackage.CARD__EXPIRY_DATE:
            return isSetExpiryDate();
        case CimPackage.CARD__PAN:
            return isSetPan();
        case CimPackage.CARD__TENDER:
            return isSetTender();
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
        result.append( " (accountHolderName: " );
        if( accountHolderNameESet )
            result.append( accountHolderName );
        else
            result.append( "<unset>" );
        result.append( ", cvNumber: " );
        if( cvNumberESet )
            result.append( cvNumber );
        else
            result.append( "<unset>" );
        result.append( ", expiryDate: " );
        if( expiryDateESet )
            result.append( expiryDate );
        else
            result.append( "<unset>" );
        result.append( ", pan: " );
        if( panESet )
            result.append( pan );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CardImpl
