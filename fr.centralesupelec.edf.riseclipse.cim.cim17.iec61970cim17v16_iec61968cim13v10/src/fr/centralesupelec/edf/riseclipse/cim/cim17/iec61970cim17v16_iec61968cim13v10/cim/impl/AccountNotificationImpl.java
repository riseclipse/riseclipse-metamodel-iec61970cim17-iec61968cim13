/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountNotificationImpl#getCustomerNotificationType <em>Customer Notification Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountNotificationImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountNotificationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountNotificationImpl#getTime <em>Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountNotificationImpl#getCustomerAccount <em>Customer Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountNotificationImpl extends CimObjectWithIDImpl implements AccountNotification {
    /**
     * The default value of the '{@link #getCustomerNotificationType() <em>Customer Notification Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerNotificationType()
     * @generated
     * @ordered
     */
    protected static final String CUSTOMER_NOTIFICATION_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomerNotificationType() <em>Customer Notification Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerNotificationType()
     * @generated
     * @ordered
     */
    protected String customerNotificationType = CUSTOMER_NOTIFICATION_TYPE_EDEFAULT;

    /**
     * This is true if the Customer Notification Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerNotificationTypeESet;

    /**
     * The default value of the '{@link #getMethodType() <em>Method Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethodType()
     * @generated
     * @ordered
     */
    protected static final String METHOD_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMethodType() <em>Method Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethodType()
     * @generated
     * @ordered
     */
    protected String methodType = METHOD_TYPE_EDEFAULT;

    /**
     * This is true if the Method Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean methodTypeESet;

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
     * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected static final Date TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected Date time = TIME_EDEFAULT;

    /**
     * This is true if the Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeESet;

    /**
     * The cached value of the '{@link #getCustomerAccount() <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAccount()
     * @generated
     * @ordered
     */
    protected CustomerAccount customerAccount;

    /**
     * This is true if the Customer Account reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerAccountESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccountNotificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccountNotification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCustomerNotificationType() {
        return customerNotificationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomerNotificationType( String newCustomerNotificationType ) {
        String oldCustomerNotificationType = customerNotificationType;
        customerNotificationType = newCustomerNotificationType;
        boolean oldCustomerNotificationTypeESet = customerNotificationTypeESet;
        customerNotificationTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_NOTIFICATION_TYPE, oldCustomerNotificationType,
                customerNotificationType, !oldCustomerNotificationTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerNotificationType() {
        String oldCustomerNotificationType = customerNotificationType;
        boolean oldCustomerNotificationTypeESet = customerNotificationTypeESet;
        customerNotificationType = CUSTOMER_NOTIFICATION_TYPE_EDEFAULT;
        customerNotificationTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_NOTIFICATION_TYPE, oldCustomerNotificationType,
                CUSTOMER_NOTIFICATION_TYPE_EDEFAULT, oldCustomerNotificationTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerNotificationType() {
        return customerNotificationTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMethodType() {
        return methodType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMethodType( String newMethodType ) {
        String oldMethodType = methodType;
        methodType = newMethodType;
        boolean oldMethodTypeESet = methodTypeESet;
        methodTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNT_NOTIFICATION__METHOD_TYPE, oldMethodType, methodType, !oldMethodTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMethodType() {
        String oldMethodType = methodType;
        boolean oldMethodTypeESet = methodTypeESet;
        methodType = METHOD_TYPE_EDEFAULT;
        methodTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACCOUNT_NOTIFICATION__METHOD_TYPE,
                    oldMethodType, METHOD_TYPE_EDEFAULT, oldMethodTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMethodType() {
        return methodTypeESet;
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
                CimPackage.ACCOUNT_NOTIFICATION__NOTE, oldNote, note, !oldNoteESet ) );
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
                CimPackage.ACCOUNT_NOTIFICATION__NOTE, oldNote, NOTE_EDEFAULT, oldNoteESet ) );
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
    public Date getTime() {
        return time;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTime( Date newTime ) {
        Date oldTime = time;
        time = newTime;
        boolean oldTimeESet = timeESet;
        timeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNT_NOTIFICATION__TIME, oldTime, time, !oldTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTime() {
        Date oldTime = time;
        boolean oldTimeESet = timeESet;
        time = TIME_EDEFAULT;
        timeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCOUNT_NOTIFICATION__TIME, oldTime, TIME_EDEFAULT, oldTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTime() {
        return timeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomerAccount( CustomerAccount newCustomerAccount, NotificationChain msgs ) {
        CustomerAccount oldCustomerAccount = customerAccount;
        customerAccount = newCustomerAccount;
        boolean oldCustomerAccountESet = customerAccountESet;
        customerAccountESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT, oldCustomerAccount, newCustomerAccount,
                    !oldCustomerAccountESet );
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
    public void setCustomerAccount( CustomerAccount newCustomerAccount ) {
        if( newCustomerAccount != customerAccount ) {
            NotificationChain msgs = null;
            if( customerAccount != null ) msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__ACCOUNT_NOTIFICATION, CustomerAccount.class, msgs );
            if( newCustomerAccount != null ) msgs = ( ( InternalEObject ) newCustomerAccount ).eInverseAdd( this,
                    CimPackage.CUSTOMER_ACCOUNT__ACCOUNT_NOTIFICATION, CustomerAccount.class, msgs );
            msgs = basicSetCustomerAccount( newCustomerAccount, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAccountESet = customerAccountESet;
            customerAccountESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT,
                            newCustomerAccount, newCustomerAccount, !oldCustomerAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomerAccount( NotificationChain msgs ) {
        CustomerAccount oldCustomerAccount = customerAccount;
        customerAccount = null;
        boolean oldCustomerAccountESet = customerAccountESet;
        customerAccountESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT, oldCustomerAccount, null,
                    oldCustomerAccountESet );
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
    public void unsetCustomerAccount() {
        if( customerAccount != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__ACCOUNT_NOTIFICATION, CustomerAccount.class, msgs );
            msgs = basicUnsetCustomerAccount( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAccountESet = customerAccountESet;
            customerAccountESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT, null, null, oldCustomerAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAccount() {
        return customerAccountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT:
            if( customerAccount != null ) msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__ACCOUNT_NOTIFICATION, CustomerAccount.class, msgs );
            return basicSetCustomerAccount( ( CustomerAccount ) otherEnd, msgs );
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
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT:
            return basicUnsetCustomerAccount( msgs );
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
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_NOTIFICATION_TYPE:
            return getCustomerNotificationType();
        case CimPackage.ACCOUNT_NOTIFICATION__METHOD_TYPE:
            return getMethodType();
        case CimPackage.ACCOUNT_NOTIFICATION__NOTE:
            return getNote();
        case CimPackage.ACCOUNT_NOTIFICATION__TIME:
            return getTime();
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT:
            return getCustomerAccount();
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
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_NOTIFICATION_TYPE:
            setCustomerNotificationType( ( String ) newValue );
            return;
        case CimPackage.ACCOUNT_NOTIFICATION__METHOD_TYPE:
            setMethodType( ( String ) newValue );
            return;
        case CimPackage.ACCOUNT_NOTIFICATION__NOTE:
            setNote( ( String ) newValue );
            return;
        case CimPackage.ACCOUNT_NOTIFICATION__TIME:
            setTime( ( Date ) newValue );
            return;
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT:
            setCustomerAccount( ( CustomerAccount ) newValue );
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
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_NOTIFICATION_TYPE:
            unsetCustomerNotificationType();
            return;
        case CimPackage.ACCOUNT_NOTIFICATION__METHOD_TYPE:
            unsetMethodType();
            return;
        case CimPackage.ACCOUNT_NOTIFICATION__NOTE:
            unsetNote();
            return;
        case CimPackage.ACCOUNT_NOTIFICATION__TIME:
            unsetTime();
            return;
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT:
            unsetCustomerAccount();
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
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_NOTIFICATION_TYPE:
            return isSetCustomerNotificationType();
        case CimPackage.ACCOUNT_NOTIFICATION__METHOD_TYPE:
            return isSetMethodType();
        case CimPackage.ACCOUNT_NOTIFICATION__NOTE:
            return isSetNote();
        case CimPackage.ACCOUNT_NOTIFICATION__TIME:
            return isSetTime();
        case CimPackage.ACCOUNT_NOTIFICATION__CUSTOMER_ACCOUNT:
            return isSetCustomerAccount();
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
        result.append( " (customerNotificationType: " );
        if( customerNotificationTypeESet )
            result.append( customerNotificationType );
        else
            result.append( "<unset>" );
        result.append( ", methodType: " );
        if( methodTypeESet )
            result.append( methodType );
        else
            result.append( "<unset>" );
        result.append( ", note: " );
        if( noteESet )
            result.append( note );
        else
            result.append( "<unset>" );
        result.append( ", time: " );
        if( timeESet )
            result.append( time );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AccountNotificationImpl
