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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask;

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
 * An implementation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkImpl#getRequestDateTime <em>Request Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkImpl#getWorkOrderNumber <em>Work Order Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkImpl#getIncidents <em>Incidents</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkImpl#getAppointments <em>Appointments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkImpl extends BaseWorkImpl implements Work {
    /**
     * The default value of the '{@link #getRequestDateTime() <em>Request Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequestDateTime()
     * @generated
     * @ordered
     */
    protected static final Date REQUEST_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRequestDateTime() <em>Request Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequestDateTime()
     * @generated
     * @ordered
     */
    protected Date requestDateTime = REQUEST_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Request Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean requestDateTimeESet;

    /**
     * The default value of the '{@link #getWorkOrderNumber() <em>Work Order Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkOrderNumber()
     * @generated
     * @ordered
     */
    protected static final String WORK_ORDER_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWorkOrderNumber() <em>Work Order Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkOrderNumber()
     * @generated
     * @ordered
     */
    protected String workOrderNumber = WORK_ORDER_NUMBER_EDEFAULT;

    /**
     * This is true if the Work Order Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean workOrderNumberESet;

    /**
     * The cached value of the '{@link #getIncidents() <em>Incidents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncidents()
     * @generated
     * @ordered
     */
    protected EList< Incident > incidents;

    /**
     * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkTasks()
     * @generated
     * @ordered
     */
    protected EList< WorkTask > workTasks;

    /**
     * The cached value of the '{@link #getCustomers() <em>Customers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomers()
     * @generated
     * @ordered
     */
    protected EList< Customer > customers;

    /**
     * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppointments()
     * @generated
     * @ordered
     */
    protected EList< Appointment > appointments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWork();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRequestDateTime( Date newRequestDateTime ) {
        Date oldRequestDateTime = requestDateTime;
        requestDateTime = newRequestDateTime;
        boolean oldRequestDateTimeESet = requestDateTimeESet;
        requestDateTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WORK__REQUEST_DATE_TIME, oldRequestDateTime, requestDateTime, !oldRequestDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRequestDateTime() {
        Date oldRequestDateTime = requestDateTime;
        boolean oldRequestDateTimeESet = requestDateTimeESet;
        requestDateTime = REQUEST_DATE_TIME_EDEFAULT;
        requestDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK__REQUEST_DATE_TIME,
                    oldRequestDateTime, REQUEST_DATE_TIME_EDEFAULT, oldRequestDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRequestDateTime() {
        return requestDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWorkOrderNumber( String newWorkOrderNumber ) {
        String oldWorkOrderNumber = workOrderNumber;
        workOrderNumber = newWorkOrderNumber;
        boolean oldWorkOrderNumberESet = workOrderNumberESet;
        workOrderNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WORK__WORK_ORDER_NUMBER, oldWorkOrderNumber, workOrderNumber, !oldWorkOrderNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkOrderNumber() {
        String oldWorkOrderNumber = workOrderNumber;
        boolean oldWorkOrderNumberESet = workOrderNumberESet;
        workOrderNumber = WORK_ORDER_NUMBER_EDEFAULT;
        workOrderNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK__WORK_ORDER_NUMBER,
                    oldWorkOrderNumber, WORK_ORDER_NUMBER_EDEFAULT, oldWorkOrderNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkOrderNumber() {
        return workOrderNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Incident > getIncidents() {
        if( incidents == null ) {
            incidents = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Incident >( Incident.class, this,
                    CimPackage.WORK__INCIDENTS, CimPackage.INCIDENT__WORKS );
        }
        return incidents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIncidents() {
        if( incidents != null ) ( ( InternalEList.Unsettable< ? > ) incidents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncidents() {
        return incidents != null && ( ( InternalEList.Unsettable< ? > ) incidents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WorkTask > getWorkTasks() {
        if( workTasks == null ) {
            workTasks = new EObjectWithInverseResolvingEList.Unsettable< WorkTask >( WorkTask.class, this,
                    CimPackage.WORK__WORK_TASKS, CimPackage.WORK_TASK__WORK );
        }
        return workTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkTasks() {
        if( workTasks != null ) ( ( InternalEList.Unsettable< ? > ) workTasks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkTasks() {
        return workTasks != null && ( ( InternalEList.Unsettable< ? > ) workTasks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Customer > getCustomers() {
        if( customers == null ) {
            customers = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Customer >( Customer.class, this,
                    CimPackage.WORK__CUSTOMERS, CimPackage.CUSTOMER__WORKS );
        }
        return customers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomers() {
        if( customers != null ) ( ( InternalEList.Unsettable< ? > ) customers ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomers() {
        return customers != null && ( ( InternalEList.Unsettable< ? > ) customers ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Appointment > getAppointments() {
        if( appointments == null ) {
            appointments = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Appointment >(
                    Appointment.class, this, CimPackage.WORK__APPOINTMENTS, CimPackage.APPOINTMENT__WORKS );
        }
        return appointments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAppointments() {
        if( appointments != null ) ( ( InternalEList.Unsettable< ? > ) appointments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAppointments() {
        return appointments != null && ( ( InternalEList.Unsettable< ? > ) appointments ).isSet();
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
        case CimPackage.WORK__INCIDENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIncidents() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.WORK__WORK_TASKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorkTasks() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.WORK__CUSTOMERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomers() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.WORK__APPOINTMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAppointments() ).basicAdd( otherEnd,
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
        case CimPackage.WORK__INCIDENTS:
            return ( ( InternalEList< ? > ) getIncidents() ).basicRemove( otherEnd, msgs );
        case CimPackage.WORK__WORK_TASKS:
            return ( ( InternalEList< ? > ) getWorkTasks() ).basicRemove( otherEnd, msgs );
        case CimPackage.WORK__CUSTOMERS:
            return ( ( InternalEList< ? > ) getCustomers() ).basicRemove( otherEnd, msgs );
        case CimPackage.WORK__APPOINTMENTS:
            return ( ( InternalEList< ? > ) getAppointments() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WORK__REQUEST_DATE_TIME:
            return getRequestDateTime();
        case CimPackage.WORK__WORK_ORDER_NUMBER:
            return getWorkOrderNumber();
        case CimPackage.WORK__INCIDENTS:
            return getIncidents();
        case CimPackage.WORK__WORK_TASKS:
            return getWorkTasks();
        case CimPackage.WORK__CUSTOMERS:
            return getCustomers();
        case CimPackage.WORK__APPOINTMENTS:
            return getAppointments();
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
        case CimPackage.WORK__REQUEST_DATE_TIME:
            setRequestDateTime( ( Date ) newValue );
            return;
        case CimPackage.WORK__WORK_ORDER_NUMBER:
            setWorkOrderNumber( ( String ) newValue );
            return;
        case CimPackage.WORK__INCIDENTS:
            getIncidents().clear();
            getIncidents().addAll( ( Collection< ? extends Incident > ) newValue );
            return;
        case CimPackage.WORK__WORK_TASKS:
            getWorkTasks().clear();
            getWorkTasks().addAll( ( Collection< ? extends WorkTask > ) newValue );
            return;
        case CimPackage.WORK__CUSTOMERS:
            getCustomers().clear();
            getCustomers().addAll( ( Collection< ? extends Customer > ) newValue );
            return;
        case CimPackage.WORK__APPOINTMENTS:
            getAppointments().clear();
            getAppointments().addAll( ( Collection< ? extends Appointment > ) newValue );
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
        case CimPackage.WORK__REQUEST_DATE_TIME:
            unsetRequestDateTime();
            return;
        case CimPackage.WORK__WORK_ORDER_NUMBER:
            unsetWorkOrderNumber();
            return;
        case CimPackage.WORK__INCIDENTS:
            unsetIncidents();
            return;
        case CimPackage.WORK__WORK_TASKS:
            unsetWorkTasks();
            return;
        case CimPackage.WORK__CUSTOMERS:
            unsetCustomers();
            return;
        case CimPackage.WORK__APPOINTMENTS:
            unsetAppointments();
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
        case CimPackage.WORK__REQUEST_DATE_TIME:
            return isSetRequestDateTime();
        case CimPackage.WORK__WORK_ORDER_NUMBER:
            return isSetWorkOrderNumber();
        case CimPackage.WORK__INCIDENTS:
            return isSetIncidents();
        case CimPackage.WORK__WORK_TASKS:
            return isSetWorkTasks();
        case CimPackage.WORK__CUSTOMERS:
            return isSetCustomers();
        case CimPackage.WORK__APPOINTMENTS:
            return isSetAppointments();
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
        result.append( " (requestDateTime: " );
        if( requestDateTimeESet )
            result.append( requestDateTime );
        else
            result.append( "<unset>" );
        result.append( ", workOrderNumber: " );
        if( workOrderNumberESet )
            result.append( workOrderNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WorkImpl
