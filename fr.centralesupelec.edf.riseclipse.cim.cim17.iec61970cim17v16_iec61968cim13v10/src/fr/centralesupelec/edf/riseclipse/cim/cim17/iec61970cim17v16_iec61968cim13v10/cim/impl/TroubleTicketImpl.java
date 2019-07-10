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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleReportingKind;
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
 * An implementation of the model object '<em><b>Trouble Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getDateTimeOfReport <em>Date Time Of Report</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getFirstResponder <em>First Responder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getReportingKind <em>Reporting Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getResolvedDateTime <em>Resolved Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getTroubleCode <em>Trouble Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getIncident <em>Incident</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TroubleTicketImpl#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TroubleTicketImpl extends DocumentImpl implements TroubleTicket {
    /**
     * The default value of the '{@link #getDateTimeOfReport() <em>Date Time Of Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTimeOfReport()
     * @generated
     * @ordered
     */
    protected static final Date DATE_TIME_OF_REPORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateTimeOfReport() <em>Date Time Of Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTimeOfReport()
     * @generated
     * @ordered
     */
    protected Date dateTimeOfReport = DATE_TIME_OF_REPORT_EDEFAULT;

    /**
     * This is true if the Date Time Of Report attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dateTimeOfReportESet;

    /**
     * The default value of the '{@link #getFirstResponder() <em>First Responder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirstResponder()
     * @generated
     * @ordered
     */
    protected static final String FIRST_RESPONDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFirstResponder() <em>First Responder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirstResponder()
     * @generated
     * @ordered
     */
    protected String firstResponder = FIRST_RESPONDER_EDEFAULT;

    /**
     * This is true if the First Responder attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean firstResponderESet;

    /**
     * The default value of the '{@link #getReportingKind() <em>Reporting Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingKind()
     * @generated
     * @ordered
     */
    protected static final TroubleReportingKind REPORTING_KIND_EDEFAULT = TroubleReportingKind.CALL;

    /**
     * The cached value of the '{@link #getReportingKind() <em>Reporting Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingKind()
     * @generated
     * @ordered
     */
    protected TroubleReportingKind reportingKind = REPORTING_KIND_EDEFAULT;

    /**
     * This is true if the Reporting Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportingKindESet;

    /**
     * The default value of the '{@link #getResolvedDateTime() <em>Resolved Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResolvedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date RESOLVED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResolvedDateTime() <em>Resolved Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResolvedDateTime()
     * @generated
     * @ordered
     */
    protected Date resolvedDateTime = RESOLVED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Resolved Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resolvedDateTimeESet;

    /**
     * The default value of the '{@link #getTroubleCode() <em>Trouble Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTroubleCode()
     * @generated
     * @ordered
     */
    protected static final String TROUBLE_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTroubleCode() <em>Trouble Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTroubleCode()
     * @generated
     * @ordered
     */
    protected String troubleCode = TROUBLE_CODE_EDEFAULT;

    /**
     * This is true if the Trouble Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean troubleCodeESet;

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
     * The cached value of the '{@link #getNotification() <em>Notification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotification()
     * @generated
     * @ordered
     */
    protected CustomerNotification notification;

    /**
     * This is true if the Notification reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean notificationESet;

    /**
     * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHazards()
     * @generated
     * @ordered
     */
    protected EList< IncidentHazard > hazards;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TroubleTicketImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTroubleTicket();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDateTimeOfReport() {
        return dateTimeOfReport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDateTimeOfReport( Date newDateTimeOfReport ) {
        Date oldDateTimeOfReport = dateTimeOfReport;
        dateTimeOfReport = newDateTimeOfReport;
        boolean oldDateTimeOfReportESet = dateTimeOfReportESet;
        dateTimeOfReportESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TROUBLE_TICKET__DATE_TIME_OF_REPORT,
                    oldDateTimeOfReport, dateTimeOfReport, !oldDateTimeOfReportESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDateTimeOfReport() {
        Date oldDateTimeOfReport = dateTimeOfReport;
        boolean oldDateTimeOfReportESet = dateTimeOfReportESet;
        dateTimeOfReport = DATE_TIME_OF_REPORT_EDEFAULT;
        dateTimeOfReportESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TROUBLE_TICKET__DATE_TIME_OF_REPORT,
                    oldDateTimeOfReport, DATE_TIME_OF_REPORT_EDEFAULT, oldDateTimeOfReportESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDateTimeOfReport() {
        return dateTimeOfReportESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFirstResponder() {
        return firstResponder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFirstResponder( String newFirstResponder ) {
        String oldFirstResponder = firstResponder;
        firstResponder = newFirstResponder;
        boolean oldFirstResponderESet = firstResponderESet;
        firstResponderESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TROUBLE_TICKET__FIRST_RESPONDER,
                    oldFirstResponder, firstResponder, !oldFirstResponderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFirstResponder() {
        String oldFirstResponder = firstResponder;
        boolean oldFirstResponderESet = firstResponderESet;
        firstResponder = FIRST_RESPONDER_EDEFAULT;
        firstResponderESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TROUBLE_TICKET__FIRST_RESPONDER,
                    oldFirstResponder, FIRST_RESPONDER_EDEFAULT, oldFirstResponderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFirstResponder() {
        return firstResponderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TroubleReportingKind getReportingKind() {
        return reportingKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReportingKind( TroubleReportingKind newReportingKind ) {
        TroubleReportingKind oldReportingKind = reportingKind;
        reportingKind = newReportingKind == null ? REPORTING_KIND_EDEFAULT : newReportingKind;
        boolean oldReportingKindESet = reportingKindESet;
        reportingKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TROUBLE_TICKET__REPORTING_KIND, oldReportingKind, reportingKind, !oldReportingKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReportingKind() {
        TroubleReportingKind oldReportingKind = reportingKind;
        boolean oldReportingKindESet = reportingKindESet;
        reportingKind = REPORTING_KIND_EDEFAULT;
        reportingKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TROUBLE_TICKET__REPORTING_KIND,
                    oldReportingKind, REPORTING_KIND_EDEFAULT, oldReportingKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportingKind() {
        return reportingKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getResolvedDateTime() {
        return resolvedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResolvedDateTime( Date newResolvedDateTime ) {
        Date oldResolvedDateTime = resolvedDateTime;
        resolvedDateTime = newResolvedDateTime;
        boolean oldResolvedDateTimeESet = resolvedDateTimeESet;
        resolvedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TROUBLE_TICKET__RESOLVED_DATE_TIME,
                    oldResolvedDateTime, resolvedDateTime, !oldResolvedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResolvedDateTime() {
        Date oldResolvedDateTime = resolvedDateTime;
        boolean oldResolvedDateTimeESet = resolvedDateTimeESet;
        resolvedDateTime = RESOLVED_DATE_TIME_EDEFAULT;
        resolvedDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TROUBLE_TICKET__RESOLVED_DATE_TIME,
                    oldResolvedDateTime, RESOLVED_DATE_TIME_EDEFAULT, oldResolvedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResolvedDateTime() {
        return resolvedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTroubleCode() {
        return troubleCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTroubleCode( String newTroubleCode ) {
        String oldTroubleCode = troubleCode;
        troubleCode = newTroubleCode;
        boolean oldTroubleCodeESet = troubleCodeESet;
        troubleCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TROUBLE_TICKET__TROUBLE_CODE, oldTroubleCode, troubleCode, !oldTroubleCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTroubleCode() {
        String oldTroubleCode = troubleCode;
        boolean oldTroubleCodeESet = troubleCodeESet;
        troubleCode = TROUBLE_CODE_EDEFAULT;
        troubleCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TROUBLE_TICKET__TROUBLE_CODE, oldTroubleCode, TROUBLE_CODE_EDEFAULT, oldTroubleCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTroubleCode() {
        return troubleCodeESet;
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
                    CimPackage.TROUBLE_TICKET__CUSTOMER, oldCustomer, newCustomer, !oldCustomerESet );
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
                    CimPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs );
            if( newCustomer != null ) msgs = ( ( InternalEObject ) newCustomer ).eInverseAdd( this,
                    CimPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs );
            msgs = basicSetCustomer( newCustomer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TROUBLE_TICKET__CUSTOMER, newCustomer, newCustomer, !oldCustomerESet ) );
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
                    CimPackage.TROUBLE_TICKET__CUSTOMER, oldCustomer, null, oldCustomerESet );
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
            msgs = ( ( InternalEObject ) customer ).eInverseRemove( this, CimPackage.CUSTOMER__TROUBLE_TICKETS,
                    Customer.class, msgs );
            msgs = basicUnsetCustomer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TROUBLE_TICKET__CUSTOMER, null, null, oldCustomerESet ) );
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
                    CimPackage.TROUBLE_TICKET__INCIDENT, oldIncident, newIncident, !oldIncidentESet );
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
                    CimPackage.INCIDENT__TROUBLE_TICKETS, Incident.class, msgs );
            if( newIncident != null ) msgs = ( ( InternalEObject ) newIncident ).eInverseAdd( this,
                    CimPackage.INCIDENT__TROUBLE_TICKETS, Incident.class, msgs );
            msgs = basicSetIncident( newIncident, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TROUBLE_TICKET__INCIDENT, newIncident, newIncident, !oldIncidentESet ) );
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
                    CimPackage.TROUBLE_TICKET__INCIDENT, oldIncident, null, oldIncidentESet );
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
            msgs = ( ( InternalEObject ) incident ).eInverseRemove( this, CimPackage.INCIDENT__TROUBLE_TICKETS,
                    Incident.class, msgs );
            msgs = basicUnsetIncident( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TROUBLE_TICKET__INCIDENT, null, null, oldIncidentESet ) );
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
    @Override
    public CustomerNotification getNotification() {
        return notification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNotification( CustomerNotification newNotification, NotificationChain msgs ) {
        CustomerNotification oldNotification = notification;
        notification = newNotification;
        boolean oldNotificationESet = notificationESet;
        notificationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TROUBLE_TICKET__NOTIFICATION, oldNotification, newNotification, !oldNotificationESet );
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
    public void setNotification( CustomerNotification newNotification ) {
        if( newNotification != notification ) {
            NotificationChain msgs = null;
            if( notification != null ) msgs = ( ( InternalEObject ) notification ).eInverseRemove( this,
                    CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS, CustomerNotification.class, msgs );
            if( newNotification != null ) msgs = ( ( InternalEObject ) newNotification ).eInverseAdd( this,
                    CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS, CustomerNotification.class, msgs );
            msgs = basicSetNotification( newNotification, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNotificationESet = notificationESet;
            notificationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TROUBLE_TICKET__NOTIFICATION, newNotification, newNotification, !oldNotificationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNotification( NotificationChain msgs ) {
        CustomerNotification oldNotification = notification;
        notification = null;
        boolean oldNotificationESet = notificationESet;
        notificationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TROUBLE_TICKET__NOTIFICATION, oldNotification, null, oldNotificationESet );
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
    public void unsetNotification() {
        if( notification != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) notification ).eInverseRemove( this,
                    CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS, CustomerNotification.class, msgs );
            msgs = basicUnsetNotification( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNotificationESet = notificationESet;
            notificationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TROUBLE_TICKET__NOTIFICATION, null, null, oldNotificationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNotification() {
        return notificationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< IncidentHazard > getHazards() {
        if( hazards == null ) {
            hazards = new EObjectWithInverseResolvingEList.Unsettable< IncidentHazard >( IncidentHazard.class, this,
                    CimPackage.TROUBLE_TICKET__HAZARDS, CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET );
        }
        return hazards;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHazards() {
        if( hazards != null ) ( ( InternalEList.Unsettable< ? > ) hazards ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHazards() {
        return hazards != null && ( ( InternalEList.Unsettable< ? > ) hazards ).isSet();
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
        case CimPackage.TROUBLE_TICKET__CUSTOMER:
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs );
            return basicSetCustomer( ( Customer ) otherEnd, msgs );
        case CimPackage.TROUBLE_TICKET__INCIDENT:
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__TROUBLE_TICKETS, Incident.class, msgs );
            return basicSetIncident( ( Incident ) otherEnd, msgs );
        case CimPackage.TROUBLE_TICKET__NOTIFICATION:
            if( notification != null ) msgs = ( ( InternalEObject ) notification ).eInverseRemove( this,
                    CimPackage.CUSTOMER_NOTIFICATION__TROUBLE_TICKETS, CustomerNotification.class, msgs );
            return basicSetNotification( ( CustomerNotification ) otherEnd, msgs );
        case CimPackage.TROUBLE_TICKET__HAZARDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHazards() ).basicAdd( otherEnd,
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
        case CimPackage.TROUBLE_TICKET__CUSTOMER:
            return basicUnsetCustomer( msgs );
        case CimPackage.TROUBLE_TICKET__INCIDENT:
            return basicUnsetIncident( msgs );
        case CimPackage.TROUBLE_TICKET__NOTIFICATION:
            return basicUnsetNotification( msgs );
        case CimPackage.TROUBLE_TICKET__HAZARDS:
            return ( ( InternalEList< ? > ) getHazards() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TROUBLE_TICKET__DATE_TIME_OF_REPORT:
            return getDateTimeOfReport();
        case CimPackage.TROUBLE_TICKET__FIRST_RESPONDER:
            return getFirstResponder();
        case CimPackage.TROUBLE_TICKET__REPORTING_KIND:
            return getReportingKind();
        case CimPackage.TROUBLE_TICKET__RESOLVED_DATE_TIME:
            return getResolvedDateTime();
        case CimPackage.TROUBLE_TICKET__TROUBLE_CODE:
            return getTroubleCode();
        case CimPackage.TROUBLE_TICKET__CUSTOMER:
            return getCustomer();
        case CimPackage.TROUBLE_TICKET__INCIDENT:
            return getIncident();
        case CimPackage.TROUBLE_TICKET__NOTIFICATION:
            return getNotification();
        case CimPackage.TROUBLE_TICKET__HAZARDS:
            return getHazards();
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
        case CimPackage.TROUBLE_TICKET__DATE_TIME_OF_REPORT:
            setDateTimeOfReport( ( Date ) newValue );
            return;
        case CimPackage.TROUBLE_TICKET__FIRST_RESPONDER:
            setFirstResponder( ( String ) newValue );
            return;
        case CimPackage.TROUBLE_TICKET__REPORTING_KIND:
            setReportingKind( ( TroubleReportingKind ) newValue );
            return;
        case CimPackage.TROUBLE_TICKET__RESOLVED_DATE_TIME:
            setResolvedDateTime( ( Date ) newValue );
            return;
        case CimPackage.TROUBLE_TICKET__TROUBLE_CODE:
            setTroubleCode( ( String ) newValue );
            return;
        case CimPackage.TROUBLE_TICKET__CUSTOMER:
            setCustomer( ( Customer ) newValue );
            return;
        case CimPackage.TROUBLE_TICKET__INCIDENT:
            setIncident( ( Incident ) newValue );
            return;
        case CimPackage.TROUBLE_TICKET__NOTIFICATION:
            setNotification( ( CustomerNotification ) newValue );
            return;
        case CimPackage.TROUBLE_TICKET__HAZARDS:
            getHazards().clear();
            getHazards().addAll( ( Collection< ? extends IncidentHazard > ) newValue );
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
        case CimPackage.TROUBLE_TICKET__DATE_TIME_OF_REPORT:
            unsetDateTimeOfReport();
            return;
        case CimPackage.TROUBLE_TICKET__FIRST_RESPONDER:
            unsetFirstResponder();
            return;
        case CimPackage.TROUBLE_TICKET__REPORTING_KIND:
            unsetReportingKind();
            return;
        case CimPackage.TROUBLE_TICKET__RESOLVED_DATE_TIME:
            unsetResolvedDateTime();
            return;
        case CimPackage.TROUBLE_TICKET__TROUBLE_CODE:
            unsetTroubleCode();
            return;
        case CimPackage.TROUBLE_TICKET__CUSTOMER:
            unsetCustomer();
            return;
        case CimPackage.TROUBLE_TICKET__INCIDENT:
            unsetIncident();
            return;
        case CimPackage.TROUBLE_TICKET__NOTIFICATION:
            unsetNotification();
            return;
        case CimPackage.TROUBLE_TICKET__HAZARDS:
            unsetHazards();
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
        case CimPackage.TROUBLE_TICKET__DATE_TIME_OF_REPORT:
            return isSetDateTimeOfReport();
        case CimPackage.TROUBLE_TICKET__FIRST_RESPONDER:
            return isSetFirstResponder();
        case CimPackage.TROUBLE_TICKET__REPORTING_KIND:
            return isSetReportingKind();
        case CimPackage.TROUBLE_TICKET__RESOLVED_DATE_TIME:
            return isSetResolvedDateTime();
        case CimPackage.TROUBLE_TICKET__TROUBLE_CODE:
            return isSetTroubleCode();
        case CimPackage.TROUBLE_TICKET__CUSTOMER:
            return isSetCustomer();
        case CimPackage.TROUBLE_TICKET__INCIDENT:
            return isSetIncident();
        case CimPackage.TROUBLE_TICKET__NOTIFICATION:
            return isSetNotification();
        case CimPackage.TROUBLE_TICKET__HAZARDS:
            return isSetHazards();
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
        result.append( " (dateTimeOfReport: " );
        if( dateTimeOfReportESet )
            result.append( dateTimeOfReport );
        else
            result.append( "<unset>" );
        result.append( ", firstResponder: " );
        if( firstResponderESet )
            result.append( firstResponder );
        else
            result.append( "<unset>" );
        result.append( ", reportingKind: " );
        if( reportingKindESet )
            result.append( reportingKind );
        else
            result.append( "<unset>" );
        result.append( ", resolvedDateTime: " );
        if( resolvedDateTimeESet )
            result.append( resolvedDateTime );
        else
            result.append( "<unset>" );
        result.append( ", troubleCode: " );
        if( troubleCodeESet )
            result.append( troubleCode );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TroubleTicketImpl
