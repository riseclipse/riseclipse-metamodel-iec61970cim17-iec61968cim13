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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Priority;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work;

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
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getPucNumber <em>Puc Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getCustomerAccounts <em>Customer Accounts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends OrganisationRoleImpl implements Customer {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final CustomerKind KIND_EDEFAULT = CustomerKind.RESIDENTIAL;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected CustomerKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocale()
     * @generated
     * @ordered
     */
    protected static final String LOCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocale()
     * @generated
     * @ordered
     */
    protected String locale = LOCALE_EDEFAULT;

    /**
     * This is true if the Locale attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean localeESet;

    /**
     * The default value of the '{@link #getPucNumber() <em>Puc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPucNumber()
     * @generated
     * @ordered
     */
    protected static final String PUC_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPucNumber() <em>Puc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPucNumber()
     * @generated
     * @ordered
     */
    protected String pucNumber = PUC_NUMBER_EDEFAULT;

    /**
     * This is true if the Puc Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pucNumberESet;

    /**
     * The default value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialNeed()
     * @generated
     * @ordered
     */
    protected static final String SPECIAL_NEED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialNeed()
     * @generated
     * @ordered
     */
    protected String specialNeed = SPECIAL_NEED_EDEFAULT;

    /**
     * This is true if the Special Need attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean specialNeedESet;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected Priority priority;

    /**
     * This is true if the Priority containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priorityESet;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getCustomerAccounts() <em>Customer Accounts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAccounts()
     * @generated
     * @ordered
     */
    protected EList< CustomerAccount > customerAccounts;

    /**
     * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevices()
     * @generated
     * @ordered
     */
    protected EList< EndDevice > endDevices;

    /**
     * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorks()
     * @generated
     * @ordered
     */
    protected EList< Work > works;

    /**
     * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreements()
     * @generated
     * @ordered
     */
    protected EList< CustomerAgreement > customerAgreements;

    /**
     * The cached value of the '{@link #getTroubleTickets() <em>Trouble Tickets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTroubleTickets()
     * @generated
     * @ordered
     */
    protected EList< TroubleTicket > troubleTickets;

    /**
     * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotifications()
     * @generated
     * @ordered
     */
    protected EList< CustomerNotification > notifications;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCustomer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( CustomerKind newKind ) {
        CustomerKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CUSTOMER__KIND,
                oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        CustomerKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
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
    public String getLocale() {
        return locale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocale( String newLocale ) {
        String oldLocale = locale;
        locale = newLocale;
        boolean oldLocaleESet = localeESet;
        localeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER__LOCALE, oldLocale, locale, !oldLocaleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocale() {
        String oldLocale = locale;
        boolean oldLocaleESet = localeESet;
        locale = LOCALE_EDEFAULT;
        localeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER__LOCALE, oldLocale, LOCALE_EDEFAULT, oldLocaleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocale() {
        return localeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPucNumber() {
        return pucNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPucNumber( String newPucNumber ) {
        String oldPucNumber = pucNumber;
        pucNumber = newPucNumber;
        boolean oldPucNumberESet = pucNumberESet;
        pucNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER__PUC_NUMBER, oldPucNumber, pucNumber, !oldPucNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPucNumber() {
        String oldPucNumber = pucNumber;
        boolean oldPucNumberESet = pucNumberESet;
        pucNumber = PUC_NUMBER_EDEFAULT;
        pucNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER__PUC_NUMBER, oldPucNumber, PUC_NUMBER_EDEFAULT, oldPucNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPucNumber() {
        return pucNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSpecialNeed() {
        return specialNeed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecialNeed( String newSpecialNeed ) {
        String oldSpecialNeed = specialNeed;
        specialNeed = newSpecialNeed;
        boolean oldSpecialNeedESet = specialNeedESet;
        specialNeedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER__SPECIAL_NEED, oldSpecialNeed, specialNeed, !oldSpecialNeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecialNeed() {
        String oldSpecialNeed = specialNeed;
        boolean oldSpecialNeedESet = specialNeedESet;
        specialNeed = SPECIAL_NEED_EDEFAULT;
        specialNeedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER__SPECIAL_NEED, oldSpecialNeed, SPECIAL_NEED_EDEFAULT, oldSpecialNeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecialNeed() {
        return specialNeedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Priority getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPriority( Priority newPriority, NotificationChain msgs ) {
        Priority oldPriority = priority;
        priority = newPriority;
        boolean oldPriorityESet = priorityESet;
        priorityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER__PRIORITY, oldPriority, newPriority, !oldPriorityESet );
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
    public void setPriority( Priority newPriority ) {
        if( newPriority != priority ) {
            NotificationChain msgs = null;
            if( priority != null ) msgs = ( ( InternalEObject ) priority ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CUSTOMER__PRIORITY, null, msgs );
            if( newPriority != null ) msgs = ( ( InternalEObject ) newPriority ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CUSTOMER__PRIORITY, null, msgs );
            msgs = basicSetPriority( newPriority, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPriorityESet = priorityESet;
            priorityESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER__PRIORITY, newPriority, newPriority, !oldPriorityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPriority( NotificationChain msgs ) {
        Priority oldPriority = priority;
        priority = null;
        boolean oldPriorityESet = priorityESet;
        priorityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER__PRIORITY, oldPriority, null, oldPriorityESet );
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
    public void unsetPriority() {
        if( priority != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) priority ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CUSTOMER__PRIORITY, null, msgs );
            msgs = basicUnsetPriority( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPriorityESet = priorityESet;
            priorityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER__PRIORITY, null, null, oldPriorityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriority() {
        return priorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.CUSTOMER__STATUS,
                    oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null ) msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CUSTOMER__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CUSTOMER__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER__STATUS, newStatus, newStatus, !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER__STATUS, oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CUSTOMER__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER__STATUS, null, null, oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CustomerAccount > getCustomerAccounts() {
        if( customerAccounts == null ) {
            customerAccounts = new EObjectWithInverseResolvingEList.Unsettable< CustomerAccount >(
                    CustomerAccount.class, this, CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER );
        }
        return customerAccounts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerAccounts() {
        if( customerAccounts != null ) ( ( InternalEList.Unsettable< ? > ) customerAccounts ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAccounts() {
        return customerAccounts != null && ( ( InternalEList.Unsettable< ? > ) customerAccounts ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDevice > getEndDevices() {
        if( endDevices == null ) {
            endDevices = new EObjectWithInverseResolvingEList.Unsettable< EndDevice >( EndDevice.class, this,
                    CimPackage.CUSTOMER__END_DEVICES, CimPackage.END_DEVICE__CUSTOMER );
        }
        return endDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDevices() {
        if( endDevices != null ) ( ( InternalEList.Unsettable< ? > ) endDevices ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevices() {
        return endDevices != null && ( ( InternalEList.Unsettable< ? > ) endDevices ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Work > getWorks() {
        if( works == null ) {
            works = new EObjectWithInverseEList.Unsettable.ManyInverse< Work >( Work.class, this,
                    CimPackage.CUSTOMER__WORKS, CimPackage.WORK__CUSTOMERS );
        }
        return works;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorks() {
        if( works != null ) ( ( InternalEList.Unsettable< ? > ) works ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorks() {
        return works != null && ( ( InternalEList.Unsettable< ? > ) works ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CustomerAgreement > getCustomerAgreements() {
        if( customerAgreements == null ) {
            customerAgreements = new EObjectWithInverseResolvingEList.Unsettable< CustomerAgreement >(
                    CustomerAgreement.class, this, CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER );
        }
        return customerAgreements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerAgreements() {
        if( customerAgreements != null ) ( ( InternalEList.Unsettable< ? > ) customerAgreements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAgreements() {
        return customerAgreements != null && ( ( InternalEList.Unsettable< ? > ) customerAgreements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TroubleTicket > getTroubleTickets() {
        if( troubleTickets == null ) {
            troubleTickets = new EObjectWithInverseResolvingEList.Unsettable< TroubleTicket >( TroubleTicket.class,
                    this, CimPackage.CUSTOMER__TROUBLE_TICKETS, CimPackage.TROUBLE_TICKET__CUSTOMER );
        }
        return troubleTickets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTroubleTickets() {
        if( troubleTickets != null ) ( ( InternalEList.Unsettable< ? > ) troubleTickets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTroubleTickets() {
        return troubleTickets != null && ( ( InternalEList.Unsettable< ? > ) troubleTickets ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CustomerNotification > getNotifications() {
        if( notifications == null ) {
            notifications = new EObjectWithInverseResolvingEList.Unsettable< CustomerNotification >(
                    CustomerNotification.class, this, CimPackage.CUSTOMER__NOTIFICATIONS,
                    CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER );
        }
        return notifications;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNotifications() {
        if( notifications != null ) ( ( InternalEList.Unsettable< ? > ) notifications ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNotifications() {
        return notifications != null && ( ( InternalEList.Unsettable< ? > ) notifications ).isSet();
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
        case CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomerAccounts() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER__END_DEVICES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDevices() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CUSTOMER__WORKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorks() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomerAgreements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER__TROUBLE_TICKETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTroubleTickets() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER__NOTIFICATIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getNotifications() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.CUSTOMER__PRIORITY:
            return basicUnsetPriority( msgs );
        case CimPackage.CUSTOMER__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS:
            return ( ( InternalEList< ? > ) getCustomerAccounts() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER__END_DEVICES:
            return ( ( InternalEList< ? > ) getEndDevices() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER__WORKS:
            return ( ( InternalEList< ? > ) getWorks() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< ? > ) getCustomerAgreements() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER__TROUBLE_TICKETS:
            return ( ( InternalEList< ? > ) getTroubleTickets() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER__NOTIFICATIONS:
            return ( ( InternalEList< ? > ) getNotifications() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CUSTOMER__KIND:
            return getKind();
        case CimPackage.CUSTOMER__LOCALE:
            return getLocale();
        case CimPackage.CUSTOMER__PUC_NUMBER:
            return getPucNumber();
        case CimPackage.CUSTOMER__SPECIAL_NEED:
            return getSpecialNeed();
        case CimPackage.CUSTOMER__PRIORITY:
            return getPriority();
        case CimPackage.CUSTOMER__STATUS:
            return getStatus();
        case CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS:
            return getCustomerAccounts();
        case CimPackage.CUSTOMER__END_DEVICES:
            return getEndDevices();
        case CimPackage.CUSTOMER__WORKS:
            return getWorks();
        case CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
            return getCustomerAgreements();
        case CimPackage.CUSTOMER__TROUBLE_TICKETS:
            return getTroubleTickets();
        case CimPackage.CUSTOMER__NOTIFICATIONS:
            return getNotifications();
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
        case CimPackage.CUSTOMER__KIND:
            setKind( ( CustomerKind ) newValue );
            return;
        case CimPackage.CUSTOMER__LOCALE:
            setLocale( ( String ) newValue );
            return;
        case CimPackage.CUSTOMER__PUC_NUMBER:
            setPucNumber( ( String ) newValue );
            return;
        case CimPackage.CUSTOMER__SPECIAL_NEED:
            setSpecialNeed( ( String ) newValue );
            return;
        case CimPackage.CUSTOMER__PRIORITY:
            setPriority( ( Priority ) newValue );
            return;
        case CimPackage.CUSTOMER__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS:
            getCustomerAccounts().clear();
            getCustomerAccounts().addAll( ( Collection< ? extends CustomerAccount > ) newValue );
            return;
        case CimPackage.CUSTOMER__END_DEVICES:
            getEndDevices().clear();
            getEndDevices().addAll( ( Collection< ? extends EndDevice > ) newValue );
            return;
        case CimPackage.CUSTOMER__WORKS:
            getWorks().clear();
            getWorks().addAll( ( Collection< ? extends Work > ) newValue );
            return;
        case CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
            getCustomerAgreements().clear();
            getCustomerAgreements().addAll( ( Collection< ? extends CustomerAgreement > ) newValue );
            return;
        case CimPackage.CUSTOMER__TROUBLE_TICKETS:
            getTroubleTickets().clear();
            getTroubleTickets().addAll( ( Collection< ? extends TroubleTicket > ) newValue );
            return;
        case CimPackage.CUSTOMER__NOTIFICATIONS:
            getNotifications().clear();
            getNotifications().addAll( ( Collection< ? extends CustomerNotification > ) newValue );
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
        case CimPackage.CUSTOMER__KIND:
            unsetKind();
            return;
        case CimPackage.CUSTOMER__LOCALE:
            unsetLocale();
            return;
        case CimPackage.CUSTOMER__PUC_NUMBER:
            unsetPucNumber();
            return;
        case CimPackage.CUSTOMER__SPECIAL_NEED:
            unsetSpecialNeed();
            return;
        case CimPackage.CUSTOMER__PRIORITY:
            unsetPriority();
            return;
        case CimPackage.CUSTOMER__STATUS:
            unsetStatus();
            return;
        case CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS:
            unsetCustomerAccounts();
            return;
        case CimPackage.CUSTOMER__END_DEVICES:
            unsetEndDevices();
            return;
        case CimPackage.CUSTOMER__WORKS:
            unsetWorks();
            return;
        case CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
            unsetCustomerAgreements();
            return;
        case CimPackage.CUSTOMER__TROUBLE_TICKETS:
            unsetTroubleTickets();
            return;
        case CimPackage.CUSTOMER__NOTIFICATIONS:
            unsetNotifications();
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
        case CimPackage.CUSTOMER__KIND:
            return isSetKind();
        case CimPackage.CUSTOMER__LOCALE:
            return isSetLocale();
        case CimPackage.CUSTOMER__PUC_NUMBER:
            return isSetPucNumber();
        case CimPackage.CUSTOMER__SPECIAL_NEED:
            return isSetSpecialNeed();
        case CimPackage.CUSTOMER__PRIORITY:
            return isSetPriority();
        case CimPackage.CUSTOMER__STATUS:
            return isSetStatus();
        case CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS:
            return isSetCustomerAccounts();
        case CimPackage.CUSTOMER__END_DEVICES:
            return isSetEndDevices();
        case CimPackage.CUSTOMER__WORKS:
            return isSetWorks();
        case CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
            return isSetCustomerAgreements();
        case CimPackage.CUSTOMER__TROUBLE_TICKETS:
            return isSetTroubleTickets();
        case CimPackage.CUSTOMER__NOTIFICATIONS:
            return isSetNotifications();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", locale: " );
        if( localeESet )
            result.append( locale );
        else
            result.append( "<unset>" );
        result.append( ", pucNumber: " );
        if( pucNumberESet )
            result.append( pucNumber );
        else
            result.append( "<unset>" );
        result.append( ", specialNeed: " );
        if( specialNeedESet )
            result.append( specialNeed );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CustomerImpl
