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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Cheque;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tender;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TenderKind;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TenderImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TenderImpl#getChange <em>Change</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TenderImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TenderImpl#getCheque <em>Cheque</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TenderImpl#getCard <em>Card</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TenderImpl#getReceipt <em>Receipt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenderImpl extends IdentifiedObjectImpl implements Tender {
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
     * The default value of the '{@link #getChange() <em>Change</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChange()
     * @generated
     * @ordered
     */
    protected static final BigDecimal CHANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChange() <em>Change</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChange()
     * @generated
     * @ordered
     */
    protected BigDecimal change = CHANGE_EDEFAULT;

    /**
     * This is true if the Change attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changeESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final TenderKind KIND_EDEFAULT = TenderKind.CHEQUE;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected TenderKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getCheque() <em>Cheque</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheque()
     * @generated
     * @ordered
     */
    protected Cheque cheque;

    /**
     * This is true if the Cheque reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean chequeESet;

    /**
     * The cached value of the '{@link #getCard() <em>Card</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCard()
     * @generated
     * @ordered
     */
    protected Card card;

    /**
     * This is true if the Card reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cardESet;

    /**
     * The cached value of the '{@link #getReceipt() <em>Receipt</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceipt()
     * @generated
     * @ordered
     */
    protected Receipt receipt;

    /**
     * This is true if the Receipt reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean receiptESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TenderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTender();
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TENDER__AMOUNT,
                oldAmount, amount, !oldAmountESet ) );
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
                CimPackage.TENDER__AMOUNT, oldAmount, AMOUNT_EDEFAULT, oldAmountESet ) );
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
    public BigDecimal getChange() {
        return change;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChange( BigDecimal newChange ) {
        BigDecimal oldChange = change;
        change = newChange;
        boolean oldChangeESet = changeESet;
        changeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TENDER__CHANGE,
                oldChange, change, !oldChangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetChange() {
        BigDecimal oldChange = change;
        boolean oldChangeESet = changeESet;
        change = CHANGE_EDEFAULT;
        changeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TENDER__CHANGE, oldChange, CHANGE_EDEFAULT, oldChangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChange() {
        return changeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TenderKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( TenderKind newKind ) {
        TenderKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TENDER__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        TenderKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TENDER__KIND,
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
    public Cheque getCheque() {
        if( cheque != null && cheque.eIsProxy() ) {
            InternalEObject oldCheque = ( InternalEObject ) cheque;
            cheque = ( Cheque ) eResolveProxy( oldCheque );
            if( cheque != oldCheque ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.TENDER__CHEQUE, oldCheque, cheque ) );
            }
        }
        return cheque;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Cheque basicGetCheque() {
        return cheque;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCheque( Cheque newCheque, NotificationChain msgs ) {
        Cheque oldCheque = cheque;
        cheque = newCheque;
        boolean oldChequeESet = chequeESet;
        chequeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.TENDER__CHEQUE,
                    oldCheque, newCheque, !oldChequeESet );
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
    public void setCheque( Cheque newCheque ) {
        if( newCheque != cheque ) {
            NotificationChain msgs = null;
            if( cheque != null ) msgs = ( ( InternalEObject ) cheque ).eInverseRemove( this, CimPackage.CHEQUE__TENDER,
                    Cheque.class, msgs );
            if( newCheque != null ) msgs = ( ( InternalEObject ) newCheque ).eInverseAdd( this,
                    CimPackage.CHEQUE__TENDER, Cheque.class, msgs );
            msgs = basicSetCheque( newCheque, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChequeESet = chequeESet;
            chequeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TENDER__CHEQUE, newCheque, newCheque, !oldChequeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCheque( NotificationChain msgs ) {
        Cheque oldCheque = cheque;
        cheque = null;
        boolean oldChequeESet = chequeESet;
        chequeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.TENDER__CHEQUE,
                    oldCheque, null, oldChequeESet );
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
    public void unsetCheque() {
        if( cheque != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cheque ).eInverseRemove( this, CimPackage.CHEQUE__TENDER, Cheque.class, msgs );
            msgs = basicUnsetCheque( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChequeESet = chequeESet;
            chequeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TENDER__CHEQUE, null, null, oldChequeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCheque() {
        return chequeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Card getCard() {
        return card;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCard( Card newCard, NotificationChain msgs ) {
        Card oldCard = card;
        card = newCard;
        boolean oldCardESet = cardESet;
        cardESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.TENDER__CARD,
                    oldCard, newCard, !oldCardESet );
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
    public void setCard( Card newCard ) {
        if( newCard != card ) {
            NotificationChain msgs = null;
            if( card != null )
                msgs = ( ( InternalEObject ) card ).eInverseRemove( this, CimPackage.CARD__TENDER, Card.class, msgs );
            if( newCard != null )
                msgs = ( ( InternalEObject ) newCard ).eInverseAdd( this, CimPackage.CARD__TENDER, Card.class, msgs );
            msgs = basicSetCard( newCard, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCardESet = cardESet;
            cardESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TENDER__CARD, newCard, newCard, !oldCardESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCard( NotificationChain msgs ) {
        Card oldCard = card;
        card = null;
        boolean oldCardESet = cardESet;
        cardESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.TENDER__CARD,
                    oldCard, null, oldCardESet );
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
    public void unsetCard() {
        if( card != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) card ).eInverseRemove( this, CimPackage.CARD__TENDER, Card.class, msgs );
            msgs = basicUnsetCard( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCardESet = cardESet;
            cardESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TENDER__CARD, null, null, oldCardESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCard() {
        return cardESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Receipt getReceipt() {
        return receipt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReceipt( Receipt newReceipt, NotificationChain msgs ) {
        Receipt oldReceipt = receipt;
        receipt = newReceipt;
        boolean oldReceiptESet = receiptESet;
        receiptESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.TENDER__RECEIPT,
                    oldReceipt, newReceipt, !oldReceiptESet );
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
    public void setReceipt( Receipt newReceipt ) {
        if( newReceipt != receipt ) {
            NotificationChain msgs = null;
            if( receipt != null ) msgs = ( ( InternalEObject ) receipt ).eInverseRemove( this,
                    CimPackage.RECEIPT__TENDERS, Receipt.class, msgs );
            if( newReceipt != null ) msgs = ( ( InternalEObject ) newReceipt ).eInverseAdd( this,
                    CimPackage.RECEIPT__TENDERS, Receipt.class, msgs );
            msgs = basicSetReceipt( newReceipt, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReceiptESet = receiptESet;
            receiptESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TENDER__RECEIPT, newReceipt, newReceipt, !oldReceiptESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReceipt( NotificationChain msgs ) {
        Receipt oldReceipt = receipt;
        receipt = null;
        boolean oldReceiptESet = receiptESet;
        receiptESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TENDER__RECEIPT, oldReceipt, null, oldReceiptESet );
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
    public void unsetReceipt() {
        if( receipt != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) receipt ).eInverseRemove( this, CimPackage.RECEIPT__TENDERS, Receipt.class,
                    msgs );
            msgs = basicUnsetReceipt( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReceiptESet = receiptESet;
            receiptESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TENDER__RECEIPT, null, null, oldReceiptESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReceipt() {
        return receiptESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TENDER__CHEQUE:
            if( cheque != null ) msgs = ( ( InternalEObject ) cheque ).eInverseRemove( this, CimPackage.CHEQUE__TENDER,
                    Cheque.class, msgs );
            return basicSetCheque( ( Cheque ) otherEnd, msgs );
        case CimPackage.TENDER__CARD:
            if( card != null )
                msgs = ( ( InternalEObject ) card ).eInverseRemove( this, CimPackage.CARD__TENDER, Card.class, msgs );
            return basicSetCard( ( Card ) otherEnd, msgs );
        case CimPackage.TENDER__RECEIPT:
            if( receipt != null ) msgs = ( ( InternalEObject ) receipt ).eInverseRemove( this,
                    CimPackage.RECEIPT__TENDERS, Receipt.class, msgs );
            return basicSetReceipt( ( Receipt ) otherEnd, msgs );
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
        case CimPackage.TENDER__CHEQUE:
            return basicUnsetCheque( msgs );
        case CimPackage.TENDER__CARD:
            return basicUnsetCard( msgs );
        case CimPackage.TENDER__RECEIPT:
            return basicUnsetReceipt( msgs );
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
        case CimPackage.TENDER__AMOUNT:
            return getAmount();
        case CimPackage.TENDER__CHANGE:
            return getChange();
        case CimPackage.TENDER__KIND:
            return getKind();
        case CimPackage.TENDER__CHEQUE:
            if( resolve ) return getCheque();
            return basicGetCheque();
        case CimPackage.TENDER__CARD:
            return getCard();
        case CimPackage.TENDER__RECEIPT:
            return getReceipt();
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
        case CimPackage.TENDER__AMOUNT:
            setAmount( ( BigDecimal ) newValue );
            return;
        case CimPackage.TENDER__CHANGE:
            setChange( ( BigDecimal ) newValue );
            return;
        case CimPackage.TENDER__KIND:
            setKind( ( TenderKind ) newValue );
            return;
        case CimPackage.TENDER__CHEQUE:
            setCheque( ( Cheque ) newValue );
            return;
        case CimPackage.TENDER__CARD:
            setCard( ( Card ) newValue );
            return;
        case CimPackage.TENDER__RECEIPT:
            setReceipt( ( Receipt ) newValue );
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
        case CimPackage.TENDER__AMOUNT:
            unsetAmount();
            return;
        case CimPackage.TENDER__CHANGE:
            unsetChange();
            return;
        case CimPackage.TENDER__KIND:
            unsetKind();
            return;
        case CimPackage.TENDER__CHEQUE:
            unsetCheque();
            return;
        case CimPackage.TENDER__CARD:
            unsetCard();
            return;
        case CimPackage.TENDER__RECEIPT:
            unsetReceipt();
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
        case CimPackage.TENDER__AMOUNT:
            return isSetAmount();
        case CimPackage.TENDER__CHANGE:
            return isSetChange();
        case CimPackage.TENDER__KIND:
            return isSetKind();
        case CimPackage.TENDER__CHEQUE:
            return isSetCheque();
        case CimPackage.TENDER__CARD:
            return isSetCard();
        case CimPackage.TENDER__RECEIPT:
            return isSetReceipt();
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
        result.append( ", change: " );
        if( changeESet )
            result.append( change );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TenderImpl
