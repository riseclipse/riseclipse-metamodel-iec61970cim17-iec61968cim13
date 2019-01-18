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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Cheque;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChequeKind;
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
 * An implementation of the model object '<em><b>Cheque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChequeImpl#getChequeNumber <em>Cheque Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChequeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChequeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChequeImpl#getMicrNumber <em>Micr Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChequeImpl#getBankAccountDetail <em>Bank Account Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChequeImpl#getTender <em>Tender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChequeImpl extends CimObjectWithIDImpl implements Cheque {
    /**
     * The default value of the '{@link #getChequeNumber() <em>Cheque Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChequeNumber()
     * @generated
     * @ordered
     */
    protected static final String CHEQUE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChequeNumber() <em>Cheque Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChequeNumber()
     * @generated
     * @ordered
     */
    protected String chequeNumber = CHEQUE_NUMBER_EDEFAULT;

    /**
     * This is true if the Cheque Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean chequeNumberESet;

    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final Date DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected Date date = DATE_EDEFAULT;

    /**
     * This is true if the Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dateESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final ChequeKind KIND_EDEFAULT = ChequeKind.POSTAL_ORDER;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected ChequeKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getMicrNumber() <em>Micr Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMicrNumber()
     * @generated
     * @ordered
     */
    protected static final String MICR_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMicrNumber() <em>Micr Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMicrNumber()
     * @generated
     * @ordered
     */
    protected String micrNumber = MICR_NUMBER_EDEFAULT;

    /**
     * This is true if the Micr Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean micrNumberESet;

    /**
     * The cached value of the '{@link #getBankAccountDetail() <em>Bank Account Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBankAccountDetail()
     * @generated
     * @ordered
     */
    protected BankAccountDetail bankAccountDetail;

    /**
     * This is true if the Bank Account Detail containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bankAccountDetailESet;

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
    protected ChequeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCheque();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getChequeNumber() {
        return chequeNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChequeNumber( String newChequeNumber ) {
        String oldChequeNumber = chequeNumber;
        chequeNumber = newChequeNumber;
        boolean oldChequeNumberESet = chequeNumberESet;
        chequeNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CHEQUE__CHEQUE_NUMBER, oldChequeNumber, chequeNumber, !oldChequeNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetChequeNumber() {
        String oldChequeNumber = chequeNumber;
        boolean oldChequeNumberESet = chequeNumberESet;
        chequeNumber = CHEQUE_NUMBER_EDEFAULT;
        chequeNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CHEQUE__CHEQUE_NUMBER, oldChequeNumber, CHEQUE_NUMBER_EDEFAULT, oldChequeNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChequeNumber() {
        return chequeNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDate( Date newDate ) {
        Date oldDate = date;
        date = newDate;
        boolean oldDateESet = dateESet;
        dateESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CHEQUE__DATE, oldDate, date, !oldDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDate() {
        Date oldDate = date;
        boolean oldDateESet = dateESet;
        date = DATE_EDEFAULT;
        dateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CHEQUE__DATE,
                oldDate, DATE_EDEFAULT, oldDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDate() {
        return dateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ChequeKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( ChequeKind newKind ) {
        ChequeKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CHEQUE__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        ChequeKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CHEQUE__KIND,
                oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMicrNumber() {
        return micrNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMicrNumber( String newMicrNumber ) {
        String oldMicrNumber = micrNumber;
        micrNumber = newMicrNumber;
        boolean oldMicrNumberESet = micrNumberESet;
        micrNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CHEQUE__MICR_NUMBER, oldMicrNumber, micrNumber, !oldMicrNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMicrNumber() {
        String oldMicrNumber = micrNumber;
        boolean oldMicrNumberESet = micrNumberESet;
        micrNumber = MICR_NUMBER_EDEFAULT;
        micrNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CHEQUE__MICR_NUMBER, oldMicrNumber, MICR_NUMBER_EDEFAULT, oldMicrNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMicrNumber() {
        return micrNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BankAccountDetail getBankAccountDetail() {
        return bankAccountDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBankAccountDetail( BankAccountDetail newBankAccountDetail,
            NotificationChain msgs ) {
        BankAccountDetail oldBankAccountDetail = bankAccountDetail;
        bankAccountDetail = newBankAccountDetail;
        boolean oldBankAccountDetailESet = bankAccountDetailESet;
        bankAccountDetailESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL, oldBankAccountDetail, newBankAccountDetail,
                    !oldBankAccountDetailESet );
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
    public void setBankAccountDetail( BankAccountDetail newBankAccountDetail ) {
        if( newBankAccountDetail != bankAccountDetail ) {
            NotificationChain msgs = null;
            if( bankAccountDetail != null ) msgs = ( ( InternalEObject ) bankAccountDetail ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL, null, msgs );
            if( newBankAccountDetail != null ) msgs = ( ( InternalEObject ) newBankAccountDetail ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL, null, msgs );
            msgs = basicSetBankAccountDetail( newBankAccountDetail, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBankAccountDetailESet = bankAccountDetailESet;
            bankAccountDetailESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL,
                        newBankAccountDetail, newBankAccountDetail, !oldBankAccountDetailESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBankAccountDetail( NotificationChain msgs ) {
        BankAccountDetail oldBankAccountDetail = bankAccountDetail;
        bankAccountDetail = null;
        boolean oldBankAccountDetailESet = bankAccountDetailESet;
        bankAccountDetailESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL, oldBankAccountDetail, null, oldBankAccountDetailESet );
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
    public void unsetBankAccountDetail() {
        if( bankAccountDetail != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) bankAccountDetail ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL, null, msgs );
            msgs = basicUnsetBankAccountDetail( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBankAccountDetailESet = bankAccountDetailESet;
            bankAccountDetailESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL, null, null, oldBankAccountDetailESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBankAccountDetail() {
        return bankAccountDetailESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tender getTender() {
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.CHEQUE__TENDER,
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
            if( tender != null ) msgs = ( ( InternalEObject ) tender ).eInverseRemove( this, CimPackage.TENDER__CHEQUE,
                    Tender.class, msgs );
            if( newTender != null ) msgs = ( ( InternalEObject ) newTender ).eInverseAdd( this,
                    CimPackage.TENDER__CHEQUE, Tender.class, msgs );
            msgs = basicSetTender( newTender, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTenderESet = tenderESet;
            tenderESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHEQUE__TENDER, newTender, newTender, !oldTenderESet ) );
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.CHEQUE__TENDER,
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
            msgs = ( ( InternalEObject ) tender ).eInverseRemove( this, CimPackage.TENDER__CHEQUE, Tender.class, msgs );
            msgs = basicUnsetTender( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTenderESet = tenderESet;
            tenderESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHEQUE__TENDER, null, null, oldTenderESet ) );
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
        case CimPackage.CHEQUE__TENDER:
            if( tender != null ) msgs = ( ( InternalEObject ) tender ).eInverseRemove( this, CimPackage.TENDER__CHEQUE,
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
        case CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
            return basicUnsetBankAccountDetail( msgs );
        case CimPackage.CHEQUE__TENDER:
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
        case CimPackage.CHEQUE__CHEQUE_NUMBER:
            return getChequeNumber();
        case CimPackage.CHEQUE__DATE:
            return getDate();
        case CimPackage.CHEQUE__KIND:
            return getKind();
        case CimPackage.CHEQUE__MICR_NUMBER:
            return getMicrNumber();
        case CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
            return getBankAccountDetail();
        case CimPackage.CHEQUE__TENDER:
            return getTender();
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
        case CimPackage.CHEQUE__CHEQUE_NUMBER:
            setChequeNumber( ( String ) newValue );
            return;
        case CimPackage.CHEQUE__DATE:
            setDate( ( Date ) newValue );
            return;
        case CimPackage.CHEQUE__KIND:
            setKind( ( ChequeKind ) newValue );
            return;
        case CimPackage.CHEQUE__MICR_NUMBER:
            setMicrNumber( ( String ) newValue );
            return;
        case CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
            setBankAccountDetail( ( BankAccountDetail ) newValue );
            return;
        case CimPackage.CHEQUE__TENDER:
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
        case CimPackage.CHEQUE__CHEQUE_NUMBER:
            unsetChequeNumber();
            return;
        case CimPackage.CHEQUE__DATE:
            unsetDate();
            return;
        case CimPackage.CHEQUE__KIND:
            unsetKind();
            return;
        case CimPackage.CHEQUE__MICR_NUMBER:
            unsetMicrNumber();
            return;
        case CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
            unsetBankAccountDetail();
            return;
        case CimPackage.CHEQUE__TENDER:
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
        case CimPackage.CHEQUE__CHEQUE_NUMBER:
            return isSetChequeNumber();
        case CimPackage.CHEQUE__DATE:
            return isSetDate();
        case CimPackage.CHEQUE__KIND:
            return isSetKind();
        case CimPackage.CHEQUE__MICR_NUMBER:
            return isSetMicrNumber();
        case CimPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
            return isSetBankAccountDetail();
        case CimPackage.CHEQUE__TENDER:
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
        result.append( " (chequeNumber: " );
        if( chequeNumberESet )
            result.append( chequeNumber );
        else
            result.append( "<unset>" );
        result.append( ", date: " );
        if( dateESet )
            result.append( date );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", micrNumber: " );
        if( micrNumberESet )
            result.append( micrNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ChequeImpl
