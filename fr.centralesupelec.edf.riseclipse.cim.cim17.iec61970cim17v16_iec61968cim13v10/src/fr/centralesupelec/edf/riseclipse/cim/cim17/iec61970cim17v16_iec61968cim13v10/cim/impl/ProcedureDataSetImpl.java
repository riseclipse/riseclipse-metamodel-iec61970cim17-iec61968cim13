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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureDataSetImpl#getCompletedDateTime <em>Completed Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureDataSetImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureDataSetImpl#getMeasurementValue <em>Measurement Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureDataSetImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureDataSetImpl#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureDataSetImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureDataSetImpl extends DocumentImpl implements ProcedureDataSet {
    /**
     * The default value of the '{@link #getCompletedDateTime() <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompletedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date COMPLETED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCompletedDateTime() <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompletedDateTime()
     * @generated
     * @ordered
     */
    protected Date completedDateTime = COMPLETED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Completed Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean completedDateTimeESet;

    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected Asset asset;

    /**
     * This is true if the Asset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetESet;

    /**
     * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValue()
     * @generated
     * @ordered
     */
    protected EList< MeasurementValue > measurementValue;

    /**
     * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedure()
     * @generated
     * @ordered
     */
    protected Procedure procedure;

    /**
     * This is true if the Procedure reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean procedureESet;

    /**
     * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkTask()
     * @generated
     * @ordered
     */
    protected WorkTask workTask;

    /**
     * This is true if the Work Task reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean workTaskESet;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList< UserAttribute > properties;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcedureDataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProcedureDataSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCompletedDateTime( Date newCompletedDateTime ) {
        Date oldCompletedDateTime = completedDateTime;
        completedDateTime = newCompletedDateTime;
        boolean oldCompletedDateTimeESet = completedDateTimeESet;
        completedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME,
                    oldCompletedDateTime, completedDateTime, !oldCompletedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCompletedDateTime() {
        Date oldCompletedDateTime = completedDateTime;
        boolean oldCompletedDateTimeESet = completedDateTimeESet;
        completedDateTime = COMPLETED_DATE_TIME_EDEFAULT;
        completedDateTimeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME,
                        oldCompletedDateTime, COMPLETED_DATE_TIME_EDEFAULT, oldCompletedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCompletedDateTime() {
        return completedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getAsset() {
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsset( Asset newAsset, NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = newAsset;
        boolean oldAssetESet = assetESet;
        assetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROCEDURE_DATA_SET__ASSET, oldAsset, newAsset, !oldAssetESet );
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
    public void setAsset( Asset newAsset ) {
        if( newAsset != asset ) {
            NotificationChain msgs = null;
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__PROCEDURE_DATA_SET, Asset.class, msgs );
            if( newAsset != null ) msgs = ( ( InternalEObject ) newAsset ).eInverseAdd( this,
                    CimPackage.ASSET__PROCEDURE_DATA_SET, Asset.class, msgs );
            msgs = basicSetAsset( newAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROCEDURE_DATA_SET__ASSET, newAsset, newAsset, !oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsset( NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = null;
        boolean oldAssetESet = assetESet;
        assetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROCEDURE_DATA_SET__ASSET, oldAsset, null, oldAssetESet );
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
    public void unsetAsset() {
        if( asset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__PROCEDURE_DATA_SET,
                    Asset.class, msgs );
            msgs = basicUnsetAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROCEDURE_DATA_SET__ASSET, null, null, oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsset() {
        return assetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeasurementValue > getMeasurementValue() {
        if( measurementValue == null ) {
            measurementValue = new EObjectWithInverseEList.Unsettable.ManyInverse< MeasurementValue >(
                    MeasurementValue.class, this, CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUE,
                    CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SET );
        }
        return measurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurementValue() {
        if( measurementValue != null ) ( ( InternalEList.Unsettable< ? > ) measurementValue ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValue() {
        return measurementValue != null && ( ( InternalEList.Unsettable< ? > ) measurementValue ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Procedure getProcedure() {
        return procedure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcedure( Procedure newProcedure, NotificationChain msgs ) {
        Procedure oldProcedure = procedure;
        procedure = newProcedure;
        boolean oldProcedureESet = procedureESet;
        procedureESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE, oldProcedure, newProcedure, !oldProcedureESet );
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
    public void setProcedure( Procedure newProcedure ) {
        if( newProcedure != procedure ) {
            NotificationChain msgs = null;
            if( procedure != null ) msgs = ( ( InternalEObject ) procedure ).eInverseRemove( this,
                    CimPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs );
            if( newProcedure != null ) msgs = ( ( InternalEObject ) newProcedure ).eInverseAdd( this,
                    CimPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs );
            msgs = basicSetProcedure( newProcedure, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProcedureESet = procedureESet;
            procedureESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE, newProcedure, newProcedure, !oldProcedureESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetProcedure( NotificationChain msgs ) {
        Procedure oldProcedure = procedure;
        procedure = null;
        boolean oldProcedureESet = procedureESet;
        procedureESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE, oldProcedure, null, oldProcedureESet );
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
    public void unsetProcedure() {
        if( procedure != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) procedure ).eInverseRemove( this, CimPackage.PROCEDURE__PROCEDURE_DATA_SETS,
                    Procedure.class, msgs );
            msgs = basicUnsetProcedure( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProcedureESet = procedureESet;
            procedureESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE, null, null, oldProcedureESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedure() {
        return procedureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkTask getWorkTask() {
        return workTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWorkTask( WorkTask newWorkTask, NotificationChain msgs ) {
        WorkTask oldWorkTask = workTask;
        workTask = newWorkTask;
        boolean oldWorkTaskESet = workTaskESet;
        workTaskESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROCEDURE_DATA_SET__WORK_TASK, oldWorkTask, newWorkTask, !oldWorkTaskESet );
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
    public void setWorkTask( WorkTask newWorkTask ) {
        if( newWorkTask != workTask ) {
            NotificationChain msgs = null;
            if( workTask != null ) msgs = ( ( InternalEObject ) workTask ).eInverseRemove( this,
                    CimPackage.WORK_TASK__PROCEDURE_DATA_SET, WorkTask.class, msgs );
            if( newWorkTask != null ) msgs = ( ( InternalEObject ) newWorkTask ).eInverseAdd( this,
                    CimPackage.WORK_TASK__PROCEDURE_DATA_SET, WorkTask.class, msgs );
            msgs = basicSetWorkTask( newWorkTask, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWorkTaskESet = workTaskESet;
            workTaskESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROCEDURE_DATA_SET__WORK_TASK, newWorkTask, newWorkTask, !oldWorkTaskESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWorkTask( NotificationChain msgs ) {
        WorkTask oldWorkTask = workTask;
        workTask = null;
        boolean oldWorkTaskESet = workTaskESet;
        workTaskESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROCEDURE_DATA_SET__WORK_TASK, oldWorkTask, null, oldWorkTaskESet );
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
    public void unsetWorkTask() {
        if( workTask != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) workTask ).eInverseRemove( this, CimPackage.WORK_TASK__PROCEDURE_DATA_SET,
                    WorkTask.class, msgs );
            msgs = basicUnsetWorkTask( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWorkTaskESet = workTaskESet;
            workTaskESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROCEDURE_DATA_SET__WORK_TASK, null, null, oldWorkTaskESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkTask() {
        return workTaskESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UserAttribute > getProperties() {
        if( properties == null ) {
            properties = new EObjectWithInverseEList.Unsettable.ManyInverse< UserAttribute >( UserAttribute.class, this,
                    CimPackage.PROCEDURE_DATA_SET__PROPERTIES, CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS );
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProperties() {
        if( properties != null ) ( ( InternalEList.Unsettable< ? > ) properties ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProperties() {
        return properties != null && ( ( InternalEList.Unsettable< ? > ) properties ).isSet();
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
        case CimPackage.PROCEDURE_DATA_SET__ASSET:
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__PROCEDURE_DATA_SET, Asset.class, msgs );
            return basicSetAsset( ( Asset ) otherEnd, msgs );
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurementValue() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            if( procedure != null ) msgs = ( ( InternalEObject ) procedure ).eInverseRemove( this,
                    CimPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs );
            return basicSetProcedure( ( Procedure ) otherEnd, msgs );
        case CimPackage.PROCEDURE_DATA_SET__WORK_TASK:
            if( workTask != null ) msgs = ( ( InternalEObject ) workTask ).eInverseRemove( this,
                    CimPackage.WORK_TASK__PROCEDURE_DATA_SET, WorkTask.class, msgs );
            return basicSetWorkTask( ( WorkTask ) otherEnd, msgs );
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProperties() ).basicAdd( otherEnd,
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
        case CimPackage.PROCEDURE_DATA_SET__ASSET:
            return basicUnsetAsset( msgs );
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUE:
            return ( ( InternalEList< ? > ) getMeasurementValue() ).basicRemove( otherEnd, msgs );
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            return basicUnsetProcedure( msgs );
        case CimPackage.PROCEDURE_DATA_SET__WORK_TASK:
            return basicUnsetWorkTask( msgs );
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            return ( ( InternalEList< ? > ) getProperties() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
            return getCompletedDateTime();
        case CimPackage.PROCEDURE_DATA_SET__ASSET:
            return getAsset();
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUE:
            return getMeasurementValue();
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            return getProcedure();
        case CimPackage.PROCEDURE_DATA_SET__WORK_TASK:
            return getWorkTask();
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            return getProperties();
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
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
            setCompletedDateTime( ( Date ) newValue );
            return;
        case CimPackage.PROCEDURE_DATA_SET__ASSET:
            setAsset( ( Asset ) newValue );
            return;
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUE:
            getMeasurementValue().clear();
            getMeasurementValue().addAll( ( Collection< ? extends MeasurementValue > ) newValue );
            return;
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            setProcedure( ( Procedure ) newValue );
            return;
        case CimPackage.PROCEDURE_DATA_SET__WORK_TASK:
            setWorkTask( ( WorkTask ) newValue );
            return;
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            getProperties().clear();
            getProperties().addAll( ( Collection< ? extends UserAttribute > ) newValue );
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
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
            unsetCompletedDateTime();
            return;
        case CimPackage.PROCEDURE_DATA_SET__ASSET:
            unsetAsset();
            return;
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUE:
            unsetMeasurementValue();
            return;
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            unsetProcedure();
            return;
        case CimPackage.PROCEDURE_DATA_SET__WORK_TASK:
            unsetWorkTask();
            return;
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            unsetProperties();
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
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
            return isSetCompletedDateTime();
        case CimPackage.PROCEDURE_DATA_SET__ASSET:
            return isSetAsset();
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUE:
            return isSetMeasurementValue();
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            return isSetProcedure();
        case CimPackage.PROCEDURE_DATA_SET__WORK_TASK:
            return isSetWorkTask();
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            return isSetProperties();
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
        result.append( " (completedDateTime: " );
        if( completedDateTimeESet )
            result.append( completedDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ProcedureDataSetImpl
