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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData;

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
 * An implementation of the model object '<em><b>Inspection Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InspectionDataSetImpl#getLocationCondition <em>Location Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InspectionDataSetImpl#getAccordingToSchedules <em>According To Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InspectionDataSetImpl extends ProcedureDataSetImpl implements InspectionDataSet {
    /**
     * The default value of the '{@link #getLocationCondition() <em>Location Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationCondition()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_CONDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocationCondition() <em>Location Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationCondition()
     * @generated
     * @ordered
     */
    protected String locationCondition = LOCATION_CONDITION_EDEFAULT;

    /**
     * This is true if the Location Condition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean locationConditionESet;

    /**
     * The cached value of the '{@link #getAccordingToSchedules() <em>According To Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccordingToSchedules()
     * @generated
     * @ordered
     */
    protected EList< ScheduledEventData > accordingToSchedules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InspectionDataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getInspectionDataSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLocationCondition() {
        return locationCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocationCondition( String newLocationCondition ) {
        String oldLocationCondition = locationCondition;
        locationCondition = newLocationCondition;
        boolean oldLocationConditionESet = locationConditionESet;
        locationConditionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.INSPECTION_DATA_SET__LOCATION_CONDITION,
                    oldLocationCondition, locationCondition, !oldLocationConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocationCondition() {
        String oldLocationCondition = locationCondition;
        boolean oldLocationConditionESet = locationConditionESet;
        locationCondition = LOCATION_CONDITION_EDEFAULT;
        locationConditionESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.INSPECTION_DATA_SET__LOCATION_CONDITION,
                        oldLocationCondition, LOCATION_CONDITION_EDEFAULT, oldLocationConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocationCondition() {
        return locationConditionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ScheduledEventData > getAccordingToSchedules() {
        if( accordingToSchedules == null ) {
            accordingToSchedules = new EObjectWithInverseResolvingEList.Unsettable< ScheduledEventData >(
                    ScheduledEventData.class, this, CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES,
                    CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET );
        }
        return accordingToSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccordingToSchedules() {
        if( accordingToSchedules != null ) ( ( InternalEList.Unsettable< ? > ) accordingToSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccordingToSchedules() {
        return accordingToSchedules != null && ( ( InternalEList.Unsettable< ? > ) accordingToSchedules ).isSet();
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
        case CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAccordingToSchedules() )
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
        case CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
            return ( ( InternalEList< ? > ) getAccordingToSchedules() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
            return getLocationCondition();
        case CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
            return getAccordingToSchedules();
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
        case CimPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
            setLocationCondition( ( String ) newValue );
            return;
        case CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
            getAccordingToSchedules().clear();
            getAccordingToSchedules().addAll( ( Collection< ? extends ScheduledEventData > ) newValue );
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
        case CimPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
            unsetLocationCondition();
            return;
        case CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
            unsetAccordingToSchedules();
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
        case CimPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
            return isSetLocationCondition();
        case CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
            return isSetAccordingToSchedules();
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
        result.append( " (locationCondition: " );
        if( locationConditionESet )
            result.append( locationCondition );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //InspectionDataSetImpl
