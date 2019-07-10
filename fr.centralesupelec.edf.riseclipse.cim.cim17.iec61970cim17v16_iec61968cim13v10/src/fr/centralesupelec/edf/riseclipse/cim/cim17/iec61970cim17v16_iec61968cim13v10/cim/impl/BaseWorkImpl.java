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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Priority;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkActivityRecord;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkLocation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkStatusKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTimeSchedule;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Base Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseWorkImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseWorkImpl#getStatusKind <em>Status Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseWorkImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseWorkImpl#getWorkActivityRecords <em>Work Activity Records</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseWorkImpl#getWorkLocation <em>Work Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseWorkImpl#getTimeSchedules <em>Time Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseWorkImpl extends DocumentImpl implements BaseWork {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final WorkKind KIND_EDEFAULT = WorkKind.CONSTRUCTION;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected WorkKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getStatusKind() <em>Status Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatusKind()
     * @generated
     * @ordered
     */
    protected static final WorkStatusKind STATUS_KIND_EDEFAULT = WorkStatusKind.WAITING_ON_APPROVAL;

    /**
     * The cached value of the '{@link #getStatusKind() <em>Status Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatusKind()
     * @generated
     * @ordered
     */
    protected WorkStatusKind statusKind = STATUS_KIND_EDEFAULT;

    /**
     * This is true if the Status Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusKindESet;

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
     * The cached value of the '{@link #getWorkActivityRecords() <em>Work Activity Records</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkActivityRecords()
     * @generated
     * @ordered
     */
    protected EList< WorkActivityRecord > workActivityRecords;

    /**
     * The cached value of the '{@link #getWorkLocation() <em>Work Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkLocation()
     * @generated
     * @ordered
     */
    protected WorkLocation workLocation;

    /**
     * This is true if the Work Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean workLocationESet;

    /**
     * The cached value of the '{@link #getTimeSchedules() <em>Time Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeSchedules()
     * @generated
     * @ordered
     */
    protected EList< WorkTimeSchedule > timeSchedules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BaseWorkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBaseWork();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( WorkKind newKind ) {
        WorkKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BASE_WORK__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        WorkKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BASE_WORK__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
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
    public WorkStatusKind getStatusKind() {
        return statusKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatusKind( WorkStatusKind newStatusKind ) {
        WorkStatusKind oldStatusKind = statusKind;
        statusKind = newStatusKind == null ? STATUS_KIND_EDEFAULT : newStatusKind;
        boolean oldStatusKindESet = statusKindESet;
        statusKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BASE_WORK__STATUS_KIND, oldStatusKind, statusKind, !oldStatusKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStatusKind() {
        WorkStatusKind oldStatusKind = statusKind;
        boolean oldStatusKindESet = statusKindESet;
        statusKind = STATUS_KIND_EDEFAULT;
        statusKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BASE_WORK__STATUS_KIND, oldStatusKind, STATUS_KIND_EDEFAULT, oldStatusKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatusKind() {
        return statusKindESet;
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
                    CimPackage.BASE_WORK__PRIORITY, oldPriority, newPriority, !oldPriorityESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.BASE_WORK__PRIORITY, null, msgs );
            if( newPriority != null ) msgs = ( ( InternalEObject ) newPriority ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.BASE_WORK__PRIORITY, null, msgs );
            msgs = basicSetPriority( newPriority, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPriorityESet = priorityESet;
            priorityESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.BASE_WORK__PRIORITY, newPriority, newPriority, !oldPriorityESet ) );
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
                    CimPackage.BASE_WORK__PRIORITY, oldPriority, null, oldPriorityESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.BASE_WORK__PRIORITY, null, msgs );
            msgs = basicUnsetPriority( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPriorityESet = priorityESet;
            priorityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BASE_WORK__PRIORITY, null, null, oldPriorityESet ) );
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
    public EList< WorkActivityRecord > getWorkActivityRecords() {
        if( workActivityRecords == null ) {
            workActivityRecords = new EObjectWithInverseResolvingEList.Unsettable< WorkActivityRecord >(
                    WorkActivityRecord.class, this, CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS,
                    CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK );
        }
        return workActivityRecords;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkActivityRecords() {
        if( workActivityRecords != null ) ( ( InternalEList.Unsettable< ? > ) workActivityRecords ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkActivityRecords() {
        return workActivityRecords != null && ( ( InternalEList.Unsettable< ? > ) workActivityRecords ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkLocation getWorkLocation() {
        return workLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWorkLocation( WorkLocation newWorkLocation, NotificationChain msgs ) {
        WorkLocation oldWorkLocation = workLocation;
        workLocation = newWorkLocation;
        boolean oldWorkLocationESet = workLocationESet;
        workLocationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BASE_WORK__WORK_LOCATION, oldWorkLocation, newWorkLocation, !oldWorkLocationESet );
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
    public void setWorkLocation( WorkLocation newWorkLocation ) {
        if( newWorkLocation != workLocation ) {
            NotificationChain msgs = null;
            if( workLocation != null ) msgs = ( ( InternalEObject ) workLocation ).eInverseRemove( this,
                    CimPackage.WORK_LOCATION__BASE_WORKS, WorkLocation.class, msgs );
            if( newWorkLocation != null ) msgs = ( ( InternalEObject ) newWorkLocation ).eInverseAdd( this,
                    CimPackage.WORK_LOCATION__BASE_WORKS, WorkLocation.class, msgs );
            msgs = basicSetWorkLocation( newWorkLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWorkLocationESet = workLocationESet;
            workLocationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.BASE_WORK__WORK_LOCATION, newWorkLocation, newWorkLocation, !oldWorkLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWorkLocation( NotificationChain msgs ) {
        WorkLocation oldWorkLocation = workLocation;
        workLocation = null;
        boolean oldWorkLocationESet = workLocationESet;
        workLocationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BASE_WORK__WORK_LOCATION, oldWorkLocation, null, oldWorkLocationESet );
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
    public void unsetWorkLocation() {
        if( workLocation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) workLocation ).eInverseRemove( this, CimPackage.WORK_LOCATION__BASE_WORKS,
                    WorkLocation.class, msgs );
            msgs = basicUnsetWorkLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWorkLocationESet = workLocationESet;
            workLocationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BASE_WORK__WORK_LOCATION, null, null, oldWorkLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkLocation() {
        return workLocationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WorkTimeSchedule > getTimeSchedules() {
        if( timeSchedules == null ) {
            timeSchedules = new EObjectWithInverseResolvingEList.Unsettable< WorkTimeSchedule >( WorkTimeSchedule.class,
                    this, CimPackage.BASE_WORK__TIME_SCHEDULES, CimPackage.WORK_TIME_SCHEDULE__BASE_WORK );
        }
        return timeSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeSchedules() {
        if( timeSchedules != null ) ( ( InternalEList.Unsettable< ? > ) timeSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeSchedules() {
        return timeSchedules != null && ( ( InternalEList.Unsettable< ? > ) timeSchedules ).isSet();
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
        case CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorkActivityRecords() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.BASE_WORK__WORK_LOCATION:
            if( workLocation != null ) msgs = ( ( InternalEObject ) workLocation ).eInverseRemove( this,
                    CimPackage.WORK_LOCATION__BASE_WORKS, WorkLocation.class, msgs );
            return basicSetWorkLocation( ( WorkLocation ) otherEnd, msgs );
        case CimPackage.BASE_WORK__TIME_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTimeSchedules() )
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
        case CimPackage.BASE_WORK__PRIORITY:
            return basicUnsetPriority( msgs );
        case CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS:
            return ( ( InternalEList< ? > ) getWorkActivityRecords() ).basicRemove( otherEnd, msgs );
        case CimPackage.BASE_WORK__WORK_LOCATION:
            return basicUnsetWorkLocation( msgs );
        case CimPackage.BASE_WORK__TIME_SCHEDULES:
            return ( ( InternalEList< ? > ) getTimeSchedules() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.BASE_WORK__KIND:
            return getKind();
        case CimPackage.BASE_WORK__STATUS_KIND:
            return getStatusKind();
        case CimPackage.BASE_WORK__PRIORITY:
            return getPriority();
        case CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS:
            return getWorkActivityRecords();
        case CimPackage.BASE_WORK__WORK_LOCATION:
            return getWorkLocation();
        case CimPackage.BASE_WORK__TIME_SCHEDULES:
            return getTimeSchedules();
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
        case CimPackage.BASE_WORK__KIND:
            setKind( ( WorkKind ) newValue );
            return;
        case CimPackage.BASE_WORK__STATUS_KIND:
            setStatusKind( ( WorkStatusKind ) newValue );
            return;
        case CimPackage.BASE_WORK__PRIORITY:
            setPriority( ( Priority ) newValue );
            return;
        case CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS:
            getWorkActivityRecords().clear();
            getWorkActivityRecords().addAll( ( Collection< ? extends WorkActivityRecord > ) newValue );
            return;
        case CimPackage.BASE_WORK__WORK_LOCATION:
            setWorkLocation( ( WorkLocation ) newValue );
            return;
        case CimPackage.BASE_WORK__TIME_SCHEDULES:
            getTimeSchedules().clear();
            getTimeSchedules().addAll( ( Collection< ? extends WorkTimeSchedule > ) newValue );
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
        case CimPackage.BASE_WORK__KIND:
            unsetKind();
            return;
        case CimPackage.BASE_WORK__STATUS_KIND:
            unsetStatusKind();
            return;
        case CimPackage.BASE_WORK__PRIORITY:
            unsetPriority();
            return;
        case CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS:
            unsetWorkActivityRecords();
            return;
        case CimPackage.BASE_WORK__WORK_LOCATION:
            unsetWorkLocation();
            return;
        case CimPackage.BASE_WORK__TIME_SCHEDULES:
            unsetTimeSchedules();
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
        case CimPackage.BASE_WORK__KIND:
            return isSetKind();
        case CimPackage.BASE_WORK__STATUS_KIND:
            return isSetStatusKind();
        case CimPackage.BASE_WORK__PRIORITY:
            return isSetPriority();
        case CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS:
            return isSetWorkActivityRecords();
        case CimPackage.BASE_WORK__WORK_LOCATION:
            return isSetWorkLocation();
        case CimPackage.BASE_WORK__TIME_SCHEDULES:
            return isSetTimeSchedules();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", statusKind: " );
        if( statusKindESet )
            result.append( statusKind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BaseWorkImpl
