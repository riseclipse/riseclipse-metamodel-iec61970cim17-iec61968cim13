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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auxiliary Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAccountImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAccountImpl#getPrincipleAmount <em>Principle Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAccountImpl#getDue <em>Due</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAccountImpl#getLastCredit <em>Last Credit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAccountImpl#getLastDebit <em>Last Debit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAccountImpl#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAccountImpl#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAccountImpl#getCharges <em>Charges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuxiliaryAccountImpl extends DocumentImpl implements AuxiliaryAccount {
    /**
     * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBalance()
     * @generated
     * @ordered
     */
    protected static final BigDecimal BALANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBalance()
     * @generated
     * @ordered
     */
    protected BigDecimal balance = BALANCE_EDEFAULT;

    /**
     * This is true if the Balance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean balanceESet;

    /**
     * The default value of the '{@link #getPrincipleAmount() <em>Principle Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrincipleAmount()
     * @generated
     * @ordered
     */
    protected static final BigDecimal PRINCIPLE_AMOUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrincipleAmount() <em>Principle Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrincipleAmount()
     * @generated
     * @ordered
     */
    protected BigDecimal principleAmount = PRINCIPLE_AMOUNT_EDEFAULT;

    /**
     * This is true if the Principle Amount attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean principleAmountESet;

    /**
     * The cached value of the '{@link #getDue() <em>Due</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDue()
     * @generated
     * @ordered
     */
    protected Due due;

    /**
     * This is true if the Due containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dueESet;

    /**
     * The cached value of the '{@link #getLastCredit() <em>Last Credit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastCredit()
     * @generated
     * @ordered
     */
    protected AccountMovement lastCredit;

    /**
     * This is true if the Last Credit containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lastCreditESet;

    /**
     * The cached value of the '{@link #getLastDebit() <em>Last Debit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastDebit()
     * @generated
     * @ordered
     */
    protected AccountMovement lastDebit;

    /**
     * This is true if the Last Debit containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lastDebitESet;

    /**
     * The cached value of the '{@link #getAuxiliaryAgreement() <em>Auxiliary Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxiliaryAgreement()
     * @generated
     * @ordered
     */
    protected AuxiliaryAgreement auxiliaryAgreement;

    /**
     * This is true if the Auxiliary Agreement reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean auxiliaryAgreementESet;

    /**
     * The cached value of the '{@link #getPaymentTransactions() <em>Payment Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPaymentTransactions()
     * @generated
     * @ordered
     */
    protected EList< Transaction > paymentTransactions;

    /**
     * The cached value of the '{@link #getCharges() <em>Charges</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharges()
     * @generated
     * @ordered
     */
    protected EList< Charge > charges;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuxiliaryAccountImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAuxiliaryAccount();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBalance( BigDecimal newBalance ) {
        BigDecimal oldBalance = balance;
        balance = newBalance;
        boolean oldBalanceESet = balanceESet;
        balanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AUXILIARY_ACCOUNT__BALANCE, oldBalance, balance, !oldBalanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBalance() {
        BigDecimal oldBalance = balance;
        boolean oldBalanceESet = balanceESet;
        balance = BALANCE_EDEFAULT;
        balanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.AUXILIARY_ACCOUNT__BALANCE, oldBalance, BALANCE_EDEFAULT, oldBalanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBalance() {
        return balanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getPrincipleAmount() {
        return principleAmount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrincipleAmount( BigDecimal newPrincipleAmount ) {
        BigDecimal oldPrincipleAmount = principleAmount;
        principleAmount = newPrincipleAmount;
        boolean oldPrincipleAmountESet = principleAmountESet;
        principleAmountESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT,
                    oldPrincipleAmount, principleAmount, !oldPrincipleAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrincipleAmount() {
        BigDecimal oldPrincipleAmount = principleAmount;
        boolean oldPrincipleAmountESet = principleAmountESet;
        principleAmount = PRINCIPLE_AMOUNT_EDEFAULT;
        principleAmountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT,
                    oldPrincipleAmount, PRINCIPLE_AMOUNT_EDEFAULT, oldPrincipleAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrincipleAmount() {
        return principleAmountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Due getDue() {
        return due;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDue( Due newDue, NotificationChain msgs ) {
        Due oldDue = due;
        due = newDue;
        boolean oldDueESet = dueESet;
        dueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AUXILIARY_ACCOUNT__DUE, oldDue, newDue, !oldDueESet );
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
    public void setDue( Due newDue ) {
        if( newDue != due ) {
            NotificationChain msgs = null;
            if( due != null ) msgs = ( ( InternalEObject ) due ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__DUE, null, msgs );
            if( newDue != null ) msgs = ( ( InternalEObject ) newDue ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__DUE, null, msgs );
            msgs = basicSetDue( newDue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDueESet = dueESet;
            dueESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.AUXILIARY_ACCOUNT__DUE, newDue, newDue, !oldDueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDue( NotificationChain msgs ) {
        Due oldDue = due;
        due = null;
        boolean oldDueESet = dueESet;
        dueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_ACCOUNT__DUE, oldDue, null, oldDueESet );
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
    public void unsetDue() {
        if( due != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) due ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__DUE, null, msgs );
            msgs = basicUnsetDue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDueESet = dueESet;
            dueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_ACCOUNT__DUE, null, null, oldDueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDue() {
        return dueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccountMovement getLastCredit() {
        return lastCredit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLastCredit( AccountMovement newLastCredit, NotificationChain msgs ) {
        AccountMovement oldLastCredit = lastCredit;
        lastCredit = newLastCredit;
        boolean oldLastCreditESet = lastCreditESet;
        lastCreditESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, oldLastCredit, newLastCredit, !oldLastCreditESet );
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
    public void setLastCredit( AccountMovement newLastCredit ) {
        if( newLastCredit != lastCredit ) {
            NotificationChain msgs = null;
            if( lastCredit != null ) msgs = ( ( InternalEObject ) lastCredit ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, null, msgs );
            if( newLastCredit != null ) msgs = ( ( InternalEObject ) newLastCredit ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, null, msgs );
            msgs = basicSetLastCredit( newLastCredit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLastCreditESet = lastCreditESet;
            lastCreditESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, newLastCredit, newLastCredit, !oldLastCreditESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLastCredit( NotificationChain msgs ) {
        AccountMovement oldLastCredit = lastCredit;
        lastCredit = null;
        boolean oldLastCreditESet = lastCreditESet;
        lastCreditESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, oldLastCredit, null, oldLastCreditESet );
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
    public void unsetLastCredit() {
        if( lastCredit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) lastCredit ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, null, msgs );
            msgs = basicUnsetLastCredit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLastCreditESet = lastCreditESet;
            lastCreditESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, null, null, oldLastCreditESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLastCredit() {
        return lastCreditESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccountMovement getLastDebit() {
        return lastDebit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLastDebit( AccountMovement newLastDebit, NotificationChain msgs ) {
        AccountMovement oldLastDebit = lastDebit;
        lastDebit = newLastDebit;
        boolean oldLastDebitESet = lastDebitESet;
        lastDebitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, oldLastDebit, newLastDebit, !oldLastDebitESet );
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
    public void setLastDebit( AccountMovement newLastDebit ) {
        if( newLastDebit != lastDebit ) {
            NotificationChain msgs = null;
            if( lastDebit != null ) msgs = ( ( InternalEObject ) lastDebit ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, null, msgs );
            if( newLastDebit != null ) msgs = ( ( InternalEObject ) newLastDebit ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, null, msgs );
            msgs = basicSetLastDebit( newLastDebit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLastDebitESet = lastDebitESet;
            lastDebitESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, newLastDebit, newLastDebit, !oldLastDebitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLastDebit( NotificationChain msgs ) {
        AccountMovement oldLastDebit = lastDebit;
        lastDebit = null;
        boolean oldLastDebitESet = lastDebitESet;
        lastDebitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, oldLastDebit, null, oldLastDebitESet );
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
    public void unsetLastDebit() {
        if( lastDebit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) lastDebit ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, null, msgs );
            msgs = basicUnsetLastDebit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLastDebitESet = lastDebitESet;
            lastDebitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, null, null, oldLastDebitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLastDebit() {
        return lastDebitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AuxiliaryAgreement getAuxiliaryAgreement() {
        return auxiliaryAgreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuxiliaryAgreement( AuxiliaryAgreement newAuxiliaryAgreement,
            NotificationChain msgs ) {
        AuxiliaryAgreement oldAuxiliaryAgreement = auxiliaryAgreement;
        auxiliaryAgreement = newAuxiliaryAgreement;
        boolean oldAuxiliaryAgreementESet = auxiliaryAgreementESet;
        auxiliaryAgreementESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT, oldAuxiliaryAgreement, newAuxiliaryAgreement,
                    !oldAuxiliaryAgreementESet );
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
    public void setAuxiliaryAgreement( AuxiliaryAgreement newAuxiliaryAgreement ) {
        if( newAuxiliaryAgreement != auxiliaryAgreement ) {
            NotificationChain msgs = null;
            if( auxiliaryAgreement != null ) msgs = ( ( InternalEObject ) auxiliaryAgreement ).eInverseRemove( this,
                    CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs );
            if( newAuxiliaryAgreement != null ) msgs = ( ( InternalEObject ) newAuxiliaryAgreement ).eInverseAdd( this,
                    CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs );
            msgs = basicSetAuxiliaryAgreement( newAuxiliaryAgreement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAuxiliaryAgreementESet = auxiliaryAgreementESet;
            auxiliaryAgreementESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT,
                            newAuxiliaryAgreement, newAuxiliaryAgreement, !oldAuxiliaryAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAuxiliaryAgreement( NotificationChain msgs ) {
        AuxiliaryAgreement oldAuxiliaryAgreement = auxiliaryAgreement;
        auxiliaryAgreement = null;
        boolean oldAuxiliaryAgreementESet = auxiliaryAgreementESet;
        auxiliaryAgreementESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT, oldAuxiliaryAgreement, null,
                    oldAuxiliaryAgreementESet );
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
    public void unsetAuxiliaryAgreement() {
        if( auxiliaryAgreement != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) auxiliaryAgreement ).eInverseRemove( this,
                    CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs );
            msgs = basicUnsetAuxiliaryAgreement( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAuxiliaryAgreementESet = auxiliaryAgreementESet;
            auxiliaryAgreementESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT, null, null, oldAuxiliaryAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxiliaryAgreement() {
        return auxiliaryAgreementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Transaction > getPaymentTransactions() {
        if( paymentTransactions == null ) {
            paymentTransactions = new EObjectWithInverseResolvingEList.Unsettable< Transaction >( Transaction.class,
                    this, CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS,
                    CimPackage.TRANSACTION__AUXILIARY_ACCOUNT );
        }
        return paymentTransactions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPaymentTransactions() {
        if( paymentTransactions != null ) ( ( InternalEList.Unsettable< ? > ) paymentTransactions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPaymentTransactions() {
        return paymentTransactions != null && ( ( InternalEList.Unsettable< ? > ) paymentTransactions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Charge > getCharges() {
        if( charges == null ) {
            charges = new EObjectWithInverseEList.Unsettable.ManyInverse< Charge >( Charge.class, this,
                    CimPackage.AUXILIARY_ACCOUNT__CHARGES, CimPackage.CHARGE__AUXILIARY_ACCOUNTS );
        }
        return charges;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCharges() {
        if( charges != null ) ( ( InternalEList.Unsettable< ? > ) charges ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCharges() {
        return charges != null && ( ( InternalEList.Unsettable< ? > ) charges ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
            if( auxiliaryAgreement != null ) msgs = ( ( InternalEObject ) auxiliaryAgreement ).eInverseRemove( this,
                    CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs );
            return basicSetAuxiliaryAgreement( ( AuxiliaryAgreement ) otherEnd, msgs );
        case CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPaymentTransactions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.AUXILIARY_ACCOUNT__CHARGES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCharges() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.AUXILIARY_ACCOUNT__DUE:
            return basicUnsetDue( msgs );
        case CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
            return basicUnsetLastCredit( msgs );
        case CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
            return basicUnsetLastDebit( msgs );
        case CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
            return basicUnsetAuxiliaryAgreement( msgs );
        case CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
            return ( ( InternalEList< ? > ) getPaymentTransactions() ).basicRemove( otherEnd, msgs );
        case CimPackage.AUXILIARY_ACCOUNT__CHARGES:
            return ( ( InternalEList< ? > ) getCharges() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.AUXILIARY_ACCOUNT__BALANCE:
            return getBalance();
        case CimPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
            return getPrincipleAmount();
        case CimPackage.AUXILIARY_ACCOUNT__DUE:
            return getDue();
        case CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
            return getLastCredit();
        case CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
            return getLastDebit();
        case CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
            return getAuxiliaryAgreement();
        case CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
            return getPaymentTransactions();
        case CimPackage.AUXILIARY_ACCOUNT__CHARGES:
            return getCharges();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.AUXILIARY_ACCOUNT__BALANCE:
            setBalance( ( BigDecimal ) newValue );
            return;
        case CimPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
            setPrincipleAmount( ( BigDecimal ) newValue );
            return;
        case CimPackage.AUXILIARY_ACCOUNT__DUE:
            setDue( ( Due ) newValue );
            return;
        case CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
            setLastCredit( ( AccountMovement ) newValue );
            return;
        case CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
            setLastDebit( ( AccountMovement ) newValue );
            return;
        case CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
            setAuxiliaryAgreement( ( AuxiliaryAgreement ) newValue );
            return;
        case CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
            getPaymentTransactions().clear();
            getPaymentTransactions().addAll( ( Collection< ? extends Transaction > ) newValue );
            return;
        case CimPackage.AUXILIARY_ACCOUNT__CHARGES:
            getCharges().clear();
            getCharges().addAll( ( Collection< ? extends Charge > ) newValue );
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
        case CimPackage.AUXILIARY_ACCOUNT__BALANCE:
            unsetBalance();
            return;
        case CimPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
            unsetPrincipleAmount();
            return;
        case CimPackage.AUXILIARY_ACCOUNT__DUE:
            unsetDue();
            return;
        case CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
            unsetLastCredit();
            return;
        case CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
            unsetLastDebit();
            return;
        case CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
            unsetAuxiliaryAgreement();
            return;
        case CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
            unsetPaymentTransactions();
            return;
        case CimPackage.AUXILIARY_ACCOUNT__CHARGES:
            unsetCharges();
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
        case CimPackage.AUXILIARY_ACCOUNT__BALANCE:
            return isSetBalance();
        case CimPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
            return isSetPrincipleAmount();
        case CimPackage.AUXILIARY_ACCOUNT__DUE:
            return isSetDue();
        case CimPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
            return isSetLastCredit();
        case CimPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
            return isSetLastDebit();
        case CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
            return isSetAuxiliaryAgreement();
        case CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
            return isSetPaymentTransactions();
        case CimPackage.AUXILIARY_ACCOUNT__CHARGES:
            return isSetCharges();
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
        result.append( " (balance: " );
        if( balanceESet )
            result.append( balance );
        else
            result.append( "<unset>" );
        result.append( ", principleAmount: " );
        if( principleAmountESet )
            result.append( principleAmount );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AuxiliaryAccountImpl
