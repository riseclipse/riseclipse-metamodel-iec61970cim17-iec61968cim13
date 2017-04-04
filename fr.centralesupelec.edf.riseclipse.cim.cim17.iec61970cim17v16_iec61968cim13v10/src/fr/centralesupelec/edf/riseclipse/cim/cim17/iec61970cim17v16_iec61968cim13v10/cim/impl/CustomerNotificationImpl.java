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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NotificationTriggerKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerNotificationImpl#getContactType <em>Contact Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerNotificationImpl#getContactValue <em>Contact Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerNotificationImpl#getEarliestDateTimeToCall <em>Earliest Date Time To Call</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerNotificationImpl#getLatestDateTimeToCall <em>Latest Date Time To Call</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerNotificationImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerNotificationImpl#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerNotificationImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerNotificationImpl#getIncident <em>Incident</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerNotificationImpl extends CimObjectWithIDImpl implements CustomerNotification {
    /**
     * The default value of the '{@link #getContactType() <em>Contact Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContactType()
     * @generated
     * @ordered
     */
    protected static final String CONTACT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContactType() <em>Contact Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContactType()
     * @generated
     * @ordered
     */
    protected String contactType = CONTACT_TYPE_EDEFAULT;

    /**
     * This is true if the Contact Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean contactTypeESet;

    /**
     * The default value of the '{@link #getContactValue() <em>Contact Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContactValue()
     * @generated
     * @ordered
     */
    protected static final String CONTACT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContactValue() <em>Contact Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContactValue()
     * @generated
     * @ordered
     */
    protected String contactValue = CONTACT_VALUE_EDEFAULT;

    /**
     * This is true if the Contact Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean contactValueESet;

    /**
     * The default value of the '{@link #getEarliestDateTimeToCall() <em>Earliest Date Time To Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarliestDateTimeToCall()
     * @generated
     * @ordered
     */
    protected static final Date EARLIEST_DATE_TIME_TO_CALL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEarliestDateTimeToCall() <em>Earliest Date Time To Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarliestDateTimeToCall()
     * @generated
     * @ordered
     */
    protected Date earliestDateTimeToCall = EARLIEST_DATE_TIME_TO_CALL_EDEFAULT;

    /**
     * This is true if the Earliest Date Time To Call attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean earliestDateTimeToCallESet;

    /**
     * The default value of the '{@link #getLatestDateTimeToCall() <em>Latest Date Time To Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLatestDateTimeToCall()
     * @generated
     * @ordered
     */
    protected static final Date LATEST_DATE_TIME_TO_CALL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLatestDateTimeToCall() <em>Latest Date Time To Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLatestDateTimeToCall()
     * @generated
     * @ordered
     */
    protected Date latestDateTimeToCall = LATEST_DATE_TIME_TO_CALL_EDEFAULT;

    /**
     * This is true if the Latest Date Time To Call attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean latestDateTimeToCallESet;

    /**
     * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
    protected static final NotificationTriggerKind TRIGGER_EDEFAULT = NotificationTriggerKind.INITIAL_ETR;

    /**
     * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
    protected NotificationTriggerKind trigger = TRIGGER_EDEFAULT;

    /**
     * This is true if the Trigger attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean triggerESet;

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
     * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomer()
     * @generated
     * @ordered
     */
    protected Customer customer;

    /**
     * This is true if the Customer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerESet;

    /**
     * The cached value of the '{@link #getIncident() <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncident()
     * @generated
     * @ordered
     */
    protected Incident incident;

    /**
     * This is true if the Incident reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean incidentESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomerNotificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCustomerNotification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getContactType() {
        return contactType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setContactType( String newContactType ) {
        String oldContactType = contactType;
        contactType = newContactType;
        boolean oldContactTypeESet = contactTypeESet;
        contactTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER_NOTIFICATION__CONTACT_TYPE, oldContactType, contactType, !oldContactTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetContactType() {
        String oldContactType = contactType;
        boolean oldContactTypeESet = contactTypeESet;
        contactType = CONTACT_TYPE_EDEFAULT;
        contactTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CUSTOMER_NOTIFICATION__CONTACT_TYPE,
                    oldContactType, CONTACT_TYPE_EDEFAULT, oldContactTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetContactType() {
        return contactTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getContactValue() {
        return contactValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setContactValue( String newContactValue ) {
        String oldContactValue = contactValue;
        contactValue = newContactValue;
        boolean oldContactValueESet = contactValueESet;
        contactValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CUSTOMER_NOTIFICATION__CONTACT_VALUE,
                    oldContactValue, contactValue, !oldContactValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetContactValue() {
        String oldContactValue = contactValue;
        boolean oldContactValueESet = contactValueESet;
        contactValue = CONTACT_VALUE_EDEFAULT;
        contactValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CUSTOMER_NOTIFICATION__CONTACT_VALUE,
                    oldContactValue, CONTACT_VALUE_EDEFAULT, oldContactValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetContactValue() {
        return contactValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getEarliestDateTimeToCall() {
        return earliestDateTimeToCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEarliestDateTimeToCall( Date newEarliestDateTimeToCall ) {
        Date oldEarliestDateTimeToCall = earliestDateTimeToCall;
        earliestDateTimeToCall = newEarliestDateTimeToCall;
        boolean oldEarliestDateTimeToCallESet = earliestDateTimeToCallESet;
        earliestDateTimeToCallESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER_NOTIFICATION__EARLIEST_DATE_TIME_TO_CALL, oldEarliestDateTimeToCall,
                earliestDateTimeToCall, !oldEarliestDateTimeToCallESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEarliestDateTimeToCall() {
        Date oldEarliestDateTimeToCall = earliestDateTimeToCall;
        boolean oldEarliestDateTimeToCallESet = earliestDateTimeToCallESet;
        earliestDateTimeToCall = EARLIEST_DATE_TIME_TO_CALL_EDEFAULT;
        earliestDateTimeToCallESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER_NOTIFICATION__EARLIEST_DATE_TIME_TO_CALL, oldEarliestDateTimeToCall,
                EARLIEST_DATE_TIME_TO_CALL_EDEFAULT, oldEarliestDateTimeToCallESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEarliestDateTimeToCall() {
        return earliestDateTimeToCallESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getLatestDateTimeToCall() {
        return latestDateTimeToCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLatestDateTimeToCall( Date newLatestDateTimeToCall ) {
        Date oldLatestDateTimeToCall = latestDateTimeToCall;
        latestDateTimeToCall = newLatestDateTimeToCall;
        boolean oldLatestDateTimeToCallESet = latestDateTimeToCallESet;
        latestDateTimeToCallESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER_NOTIFICATION__LATEST_DATE_TIME_TO_CALL, oldLatestDateTimeToCall,
                latestDateTimeToCall, !oldLatestDateTimeToCallESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLatestDateTimeToCall() {
        Date oldLatestDateTimeToCall = latestDateTimeToCall;
        boolean oldLatestDateTimeToCallESet = latestDateTimeToCallESet;
        latestDateTimeToCall = LATEST_DATE_TIME_TO_CALL_EDEFAULT;
        latestDateTimeToCallESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER_NOTIFICATION__LATEST_DATE_TIME_TO_CALL, oldLatestDateTimeToCall,
                LATEST_DATE_TIME_TO_CALL_EDEFAULT, oldLatestDateTimeToCallESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLatestDateTimeToCall() {
        return latestDateTimeToCallESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationTriggerKind getTrigger() {
        return trigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTrigger( NotificationTriggerKind newTrigger ) {
        NotificationTriggerKind oldTrigger = trigger;
        trigger = newTrigger == null ? TRIGGER_EDEFAULT : newTrigger;
        boolean oldTriggerESet = triggerESet;
        triggerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER_NOTIFICATION__TRIGGER, oldTrigger, trigger, !oldTriggerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTrigger() {
        NotificationTriggerKind oldTrigger = trigger;
        boolean oldTriggerESet = triggerESet;
        trigger = TRIGGER_EDEFAULT;
        triggerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER_NOTIFICATION__TRIGGER, oldTrigger, TRIGGER_EDEFAULT, oldTriggerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTrigger() {
        return triggerESet;
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
                    this, CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS, CimPackage.TROUBLE_TICKET__NOTIFICATION );
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
    public Customer getCustomer() {
        return customer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomer( Customer newCustomer, NotificationChain msgs ) {
        Customer oldCustomer = customer;
        customer = newCustomer;
        boolean oldCustomerESet = customerESet;
        customerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER, oldCustomer, newCustomer, !oldCustomerESet );
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
    public void setCustomer( Customer newCustomer ) {
        if( newCustomer != customer ) {
            NotificationChain msgs = null;
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__NOTIFICATIONS, Customer.class, msgs );
            if( newCustomer != null ) msgs = ( ( InternalEObject ) newCustomer ).eInverseAdd( this,
                    CimPackage.CUSTOMER__NOTIFICATIONS, Customer.class, msgs );
            msgs = basicSetCustomer( newCustomer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER, newCustomer, newCustomer, !oldCustomerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomer( NotificationChain msgs ) {
        Customer oldCustomer = customer;
        customer = null;
        boolean oldCustomerESet = customerESet;
        customerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER, oldCustomer, null, oldCustomerESet );
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
    public void unsetCustomer() {
        if( customer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customer ).eInverseRemove( this, CimPackage.CUSTOMER__NOTIFICATIONS,
                    Customer.class, msgs );
            msgs = basicUnsetCustomer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER, null, null, oldCustomerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomer() {
        return customerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Incident getIncident() {
        return incident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncident( Incident newIncident, NotificationChain msgs ) {
        Incident oldIncident = incident;
        incident = newIncident;
        boolean oldIncidentESet = incidentESet;
        incidentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_NOTIFICATION__INCIDENT, oldIncident, newIncident, !oldIncidentESet );
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
    public void setIncident( Incident newIncident ) {
        if( newIncident != incident ) {
            NotificationChain msgs = null;
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS, Incident.class, msgs );
            if( newIncident != null ) msgs = ( ( InternalEObject ) newIncident ).eInverseAdd( this,
                    CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS, Incident.class, msgs );
            msgs = basicSetIncident( newIncident, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_NOTIFICATION__INCIDENT, newIncident, newIncident, !oldIncidentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIncident( NotificationChain msgs ) {
        Incident oldIncident = incident;
        incident = null;
        boolean oldIncidentESet = incidentESet;
        incidentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_NOTIFICATION__INCIDENT, oldIncident, null, oldIncidentESet );
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
    public void unsetIncident() {
        if( incident != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) incident ).eInverseRemove( this, CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS,
                    Incident.class, msgs );
            msgs = basicUnsetIncident( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_NOTIFICATION__INCIDENT, null, null, oldIncidentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncident() {
        return incidentESet;
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
        case CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTroubleTickets() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER:
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__NOTIFICATIONS, Customer.class, msgs );
            return basicSetCustomer( ( Customer ) otherEnd, msgs );
        case CimPackage.CUSTOMER_NOTIFICATION__INCIDENT:
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS, Incident.class, msgs );
            return basicSetIncident( ( Incident ) otherEnd, msgs );
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
        case CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS:
            return ( ( InternalEList< ? > ) getTroubleTickets() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER:
            return basicUnsetCustomer( msgs );
        case CimPackage.CUSTOMER_NOTIFICATION__INCIDENT:
            return basicUnsetIncident( msgs );
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
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_TYPE:
            return getContactType();
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_VALUE:
            return getContactValue();
        case CimPackage.CUSTOMER_NOTIFICATION__EARLIEST_DATE_TIME_TO_CALL:
            return getEarliestDateTimeToCall();
        case CimPackage.CUSTOMER_NOTIFICATION__LATEST_DATE_TIME_TO_CALL:
            return getLatestDateTimeToCall();
        case CimPackage.CUSTOMER_NOTIFICATION__TRIGGER:
            return getTrigger();
        case CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS:
            return getTroubleTickets();
        case CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER:
            return getCustomer();
        case CimPackage.CUSTOMER_NOTIFICATION__INCIDENT:
            return getIncident();
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
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_TYPE:
            setContactType( ( String ) newValue );
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_VALUE:
            setContactValue( ( String ) newValue );
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__EARLIEST_DATE_TIME_TO_CALL:
            setEarliestDateTimeToCall( ( Date ) newValue );
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__LATEST_DATE_TIME_TO_CALL:
            setLatestDateTimeToCall( ( Date ) newValue );
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__TRIGGER:
            setTrigger( ( NotificationTriggerKind ) newValue );
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS:
            getTroubleTickets().clear();
            getTroubleTickets().addAll( ( Collection< ? extends TroubleTicket > ) newValue );
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER:
            setCustomer( ( Customer ) newValue );
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__INCIDENT:
            setIncident( ( Incident ) newValue );
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
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_TYPE:
            unsetContactType();
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_VALUE:
            unsetContactValue();
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__EARLIEST_DATE_TIME_TO_CALL:
            unsetEarliestDateTimeToCall();
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__LATEST_DATE_TIME_TO_CALL:
            unsetLatestDateTimeToCall();
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__TRIGGER:
            unsetTrigger();
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS:
            unsetTroubleTickets();
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER:
            unsetCustomer();
            return;
        case CimPackage.CUSTOMER_NOTIFICATION__INCIDENT:
            unsetIncident();
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
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_TYPE:
            return isSetContactType();
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_VALUE:
            return isSetContactValue();
        case CimPackage.CUSTOMER_NOTIFICATION__EARLIEST_DATE_TIME_TO_CALL:
            return isSetEarliestDateTimeToCall();
        case CimPackage.CUSTOMER_NOTIFICATION__LATEST_DATE_TIME_TO_CALL:
            return isSetLatestDateTimeToCall();
        case CimPackage.CUSTOMER_NOTIFICATION__TRIGGER:
            return isSetTrigger();
        case CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS:
            return isSetTroubleTickets();
        case CimPackage.CUSTOMER_NOTIFICATION__CUSTOMER:
            return isSetCustomer();
        case CimPackage.CUSTOMER_NOTIFICATION__INCIDENT:
            return isSetIncident();
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
        result.append( " (contactType: " );
        if( contactTypeESet )
            result.append( contactType );
        else
            result.append( "<unset>" );
        result.append( ", contactValue: " );
        if( contactValueESet )
            result.append( contactValue );
        else
            result.append( "<unset>" );
        result.append( ", earliestDateTimeToCall: " );
        if( earliestDateTimeToCallESet )
            result.append( earliestDateTimeToCall );
        else
            result.append( "<unset>" );
        result.append( ", latestDateTimeToCall: " );
        if( latestDateTimeToCallESet )
            result.append( latestDateTimeToCall );
        else
            result.append( "<unset>" );
        result.append( ", trigger: " );
        if( triggerESet )
            result.append( trigger );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CustomerNotificationImpl
