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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetTestSampleTaker;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen;

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
 * An implementation of the model object '<em><b>Specimen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SpecimenImpl#getAmbientTemperatureAtSampling <em>Ambient Temperature At Sampling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SpecimenImpl#getHumidityAtSampling <em>Humidity At Sampling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SpecimenImpl#getSpecimenID <em>Specimen ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SpecimenImpl#getSpecimenSampleDateTime <em>Specimen Sample Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SpecimenImpl#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SpecimenImpl#getLabTestDataSet <em>Lab Test Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SpecimenImpl#getAssetTestSampleTaker <em>Asset Test Sample Taker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenImpl extends IdentifiedObjectImpl implements Specimen {
    /**
     * The default value of the '{@link #getAmbientTemperatureAtSampling() <em>Ambient Temperature At Sampling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmbientTemperatureAtSampling()
     * @generated
     * @ordered
     */
    protected static final Float AMBIENT_TEMPERATURE_AT_SAMPLING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAmbientTemperatureAtSampling() <em>Ambient Temperature At Sampling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmbientTemperatureAtSampling()
     * @generated
     * @ordered
     */
    protected Float ambientTemperatureAtSampling = AMBIENT_TEMPERATURE_AT_SAMPLING_EDEFAULT;

    /**
     * This is true if the Ambient Temperature At Sampling attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ambientTemperatureAtSamplingESet;

    /**
     * The default value of the '{@link #getHumidityAtSampling() <em>Humidity At Sampling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHumidityAtSampling()
     * @generated
     * @ordered
     */
    protected static final Float HUMIDITY_AT_SAMPLING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHumidityAtSampling() <em>Humidity At Sampling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHumidityAtSampling()
     * @generated
     * @ordered
     */
    protected Float humidityAtSampling = HUMIDITY_AT_SAMPLING_EDEFAULT;

    /**
     * This is true if the Humidity At Sampling attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean humidityAtSamplingESet;

    /**
     * The default value of the '{@link #getSpecimenID() <em>Specimen ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenID()
     * @generated
     * @ordered
     */
    protected static final String SPECIMEN_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecimenID() <em>Specimen ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenID()
     * @generated
     * @ordered
     */
    protected String specimenID = SPECIMEN_ID_EDEFAULT;

    /**
     * This is true if the Specimen ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean specimenIDESet;

    /**
     * The default value of the '{@link #getSpecimenSampleDateTime() <em>Specimen Sample Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenSampleDateTime()
     * @generated
     * @ordered
     */
    protected static final Date SPECIMEN_SAMPLE_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecimenSampleDateTime() <em>Specimen Sample Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenSampleDateTime()
     * @generated
     * @ordered
     */
    protected Date specimenSampleDateTime = SPECIMEN_SAMPLE_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Specimen Sample Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean specimenSampleDateTimeESet;

    /**
     * The default value of the '{@link #getSpecimenToLabDateTime() <em>Specimen To Lab Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenToLabDateTime()
     * @generated
     * @ordered
     */
    protected static final Date SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecimenToLabDateTime() <em>Specimen To Lab Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenToLabDateTime()
     * @generated
     * @ordered
     */
    protected Date specimenToLabDateTime = SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Specimen To Lab Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean specimenToLabDateTimeESet;

    /**
     * The cached value of the '{@link #getLabTestDataSet() <em>Lab Test Data Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabTestDataSet()
     * @generated
     * @ordered
     */
    protected EList< LabTestDataSet > labTestDataSet;

    /**
     * The cached value of the '{@link #getAssetTestSampleTaker() <em>Asset Test Sample Taker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetTestSampleTaker()
     * @generated
     * @ordered
     */
    protected AssetTestSampleTaker assetTestSampleTaker;

    /**
     * This is true if the Asset Test Sample Taker reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetTestSampleTakerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecimenImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSpecimen();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAmbientTemperatureAtSampling() {
        return ambientTemperatureAtSampling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAmbientTemperatureAtSampling( Float newAmbientTemperatureAtSampling ) {
        Float oldAmbientTemperatureAtSampling = ambientTemperatureAtSampling;
        ambientTemperatureAtSampling = newAmbientTemperatureAtSampling;
        boolean oldAmbientTemperatureAtSamplingESet = ambientTemperatureAtSamplingESet;
        ambientTemperatureAtSamplingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SPECIMEN__AMBIENT_TEMPERATURE_AT_SAMPLING, oldAmbientTemperatureAtSampling,
                ambientTemperatureAtSampling, !oldAmbientTemperatureAtSamplingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAmbientTemperatureAtSampling() {
        Float oldAmbientTemperatureAtSampling = ambientTemperatureAtSampling;
        boolean oldAmbientTemperatureAtSamplingESet = ambientTemperatureAtSamplingESet;
        ambientTemperatureAtSampling = AMBIENT_TEMPERATURE_AT_SAMPLING_EDEFAULT;
        ambientTemperatureAtSamplingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SPECIMEN__AMBIENT_TEMPERATURE_AT_SAMPLING, oldAmbientTemperatureAtSampling,
                AMBIENT_TEMPERATURE_AT_SAMPLING_EDEFAULT, oldAmbientTemperatureAtSamplingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAmbientTemperatureAtSampling() {
        return ambientTemperatureAtSamplingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHumidityAtSampling() {
        return humidityAtSampling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHumidityAtSampling( Float newHumidityAtSampling ) {
        Float oldHumidityAtSampling = humidityAtSampling;
        humidityAtSampling = newHumidityAtSampling;
        boolean oldHumidityAtSamplingESet = humidityAtSamplingESet;
        humidityAtSamplingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SPECIMEN__HUMIDITY_AT_SAMPLING,
                    oldHumidityAtSampling, humidityAtSampling, !oldHumidityAtSamplingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHumidityAtSampling() {
        Float oldHumidityAtSampling = humidityAtSampling;
        boolean oldHumidityAtSamplingESet = humidityAtSamplingESet;
        humidityAtSampling = HUMIDITY_AT_SAMPLING_EDEFAULT;
        humidityAtSamplingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SPECIMEN__HUMIDITY_AT_SAMPLING,
                    oldHumidityAtSampling, HUMIDITY_AT_SAMPLING_EDEFAULT, oldHumidityAtSamplingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHumidityAtSampling() {
        return humidityAtSamplingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSpecimenID() {
        return specimenID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecimenID( String newSpecimenID ) {
        String oldSpecimenID = specimenID;
        specimenID = newSpecimenID;
        boolean oldSpecimenIDESet = specimenIDESet;
        specimenIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SPECIMEN__SPECIMEN_ID, oldSpecimenID, specimenID, !oldSpecimenIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecimenID() {
        String oldSpecimenID = specimenID;
        boolean oldSpecimenIDESet = specimenIDESet;
        specimenID = SPECIMEN_ID_EDEFAULT;
        specimenIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SPECIMEN__SPECIMEN_ID, oldSpecimenID, SPECIMEN_ID_EDEFAULT, oldSpecimenIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecimenID() {
        return specimenIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getSpecimenSampleDateTime() {
        return specimenSampleDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecimenSampleDateTime( Date newSpecimenSampleDateTime ) {
        Date oldSpecimenSampleDateTime = specimenSampleDateTime;
        specimenSampleDateTime = newSpecimenSampleDateTime;
        boolean oldSpecimenSampleDateTimeESet = specimenSampleDateTimeESet;
        specimenSampleDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SPECIMEN__SPECIMEN_SAMPLE_DATE_TIME,
                    oldSpecimenSampleDateTime, specimenSampleDateTime, !oldSpecimenSampleDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecimenSampleDateTime() {
        Date oldSpecimenSampleDateTime = specimenSampleDateTime;
        boolean oldSpecimenSampleDateTimeESet = specimenSampleDateTimeESet;
        specimenSampleDateTime = SPECIMEN_SAMPLE_DATE_TIME_EDEFAULT;
        specimenSampleDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SPECIMEN__SPECIMEN_SAMPLE_DATE_TIME,
                    oldSpecimenSampleDateTime, SPECIMEN_SAMPLE_DATE_TIME_EDEFAULT, oldSpecimenSampleDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecimenSampleDateTime() {
        return specimenSampleDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getSpecimenToLabDateTime() {
        return specimenToLabDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecimenToLabDateTime( Date newSpecimenToLabDateTime ) {
        Date oldSpecimenToLabDateTime = specimenToLabDateTime;
        specimenToLabDateTime = newSpecimenToLabDateTime;
        boolean oldSpecimenToLabDateTimeESet = specimenToLabDateTimeESet;
        specimenToLabDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SPECIMEN__SPECIMEN_TO_LAB_DATE_TIME,
                    oldSpecimenToLabDateTime, specimenToLabDateTime, !oldSpecimenToLabDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecimenToLabDateTime() {
        Date oldSpecimenToLabDateTime = specimenToLabDateTime;
        boolean oldSpecimenToLabDateTimeESet = specimenToLabDateTimeESet;
        specimenToLabDateTime = SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT;
        specimenToLabDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SPECIMEN__SPECIMEN_TO_LAB_DATE_TIME,
                    oldSpecimenToLabDateTime, SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT, oldSpecimenToLabDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecimenToLabDateTime() {
        return specimenToLabDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LabTestDataSet > getLabTestDataSet() {
        if( labTestDataSet == null ) {
            labTestDataSet = new EObjectWithInverseResolvingEList.Unsettable< LabTestDataSet >( LabTestDataSet.class,
                    this, CimPackage.SPECIMEN__LAB_TEST_DATA_SET, CimPackage.LAB_TEST_DATA_SET__SPECIMEN );
        }
        return labTestDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLabTestDataSet() {
        if( labTestDataSet != null ) ( ( InternalEList.Unsettable< ? > ) labTestDataSet ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLabTestDataSet() {
        return labTestDataSet != null && ( ( InternalEList.Unsettable< ? > ) labTestDataSet ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetTestSampleTaker getAssetTestSampleTaker() {
        return assetTestSampleTaker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetTestSampleTaker( AssetTestSampleTaker newAssetTestSampleTaker,
            NotificationChain msgs ) {
        AssetTestSampleTaker oldAssetTestSampleTaker = assetTestSampleTaker;
        assetTestSampleTaker = newAssetTestSampleTaker;
        boolean oldAssetTestSampleTakerESet = assetTestSampleTakerESet;
        assetTestSampleTakerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER, oldAssetTestSampleTaker, newAssetTestSampleTaker,
                    !oldAssetTestSampleTakerESet );
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
    public void setAssetTestSampleTaker( AssetTestSampleTaker newAssetTestSampleTaker ) {
        if( newAssetTestSampleTaker != assetTestSampleTaker ) {
            NotificationChain msgs = null;
            if( assetTestSampleTaker != null ) msgs = ( ( InternalEObject ) assetTestSampleTaker ).eInverseRemove( this,
                    CimPackage.ASSET_TEST_SAMPLE_TAKER__SPECIMEN, AssetTestSampleTaker.class, msgs );
            if( newAssetTestSampleTaker != null )
                msgs = ( ( InternalEObject ) newAssetTestSampleTaker ).eInverseAdd( this,
                        CimPackage.ASSET_TEST_SAMPLE_TAKER__SPECIMEN, AssetTestSampleTaker.class, msgs );
            msgs = basicSetAssetTestSampleTaker( newAssetTestSampleTaker, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetTestSampleTakerESet = assetTestSampleTakerESet;
            assetTestSampleTakerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER,
                        newAssetTestSampleTaker, newAssetTestSampleTaker, !oldAssetTestSampleTakerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetTestSampleTaker( NotificationChain msgs ) {
        AssetTestSampleTaker oldAssetTestSampleTaker = assetTestSampleTaker;
        assetTestSampleTaker = null;
        boolean oldAssetTestSampleTakerESet = assetTestSampleTakerESet;
        assetTestSampleTakerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER, oldAssetTestSampleTaker, null,
                    oldAssetTestSampleTakerESet );
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
    public void unsetAssetTestSampleTaker() {
        if( assetTestSampleTaker != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetTestSampleTaker ).eInverseRemove( this,
                    CimPackage.ASSET_TEST_SAMPLE_TAKER__SPECIMEN, AssetTestSampleTaker.class, msgs );
            msgs = basicUnsetAssetTestSampleTaker( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetTestSampleTakerESet = assetTestSampleTakerESet;
            assetTestSampleTakerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER, null, null, oldAssetTestSampleTakerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetTestSampleTaker() {
        return assetTestSampleTakerESet;
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
        case CimPackage.SPECIMEN__LAB_TEST_DATA_SET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLabTestDataSet() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER:
            if( assetTestSampleTaker != null ) msgs = ( ( InternalEObject ) assetTestSampleTaker ).eInverseRemove( this,
                    CimPackage.ASSET_TEST_SAMPLE_TAKER__SPECIMEN, AssetTestSampleTaker.class, msgs );
            return basicSetAssetTestSampleTaker( ( AssetTestSampleTaker ) otherEnd, msgs );
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
        case CimPackage.SPECIMEN__LAB_TEST_DATA_SET:
            return ( ( InternalEList< ? > ) getLabTestDataSet() ).basicRemove( otherEnd, msgs );
        case CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER:
            return basicUnsetAssetTestSampleTaker( msgs );
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
        case CimPackage.SPECIMEN__AMBIENT_TEMPERATURE_AT_SAMPLING:
            return getAmbientTemperatureAtSampling();
        case CimPackage.SPECIMEN__HUMIDITY_AT_SAMPLING:
            return getHumidityAtSampling();
        case CimPackage.SPECIMEN__SPECIMEN_ID:
            return getSpecimenID();
        case CimPackage.SPECIMEN__SPECIMEN_SAMPLE_DATE_TIME:
            return getSpecimenSampleDateTime();
        case CimPackage.SPECIMEN__SPECIMEN_TO_LAB_DATE_TIME:
            return getSpecimenToLabDateTime();
        case CimPackage.SPECIMEN__LAB_TEST_DATA_SET:
            return getLabTestDataSet();
        case CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER:
            return getAssetTestSampleTaker();
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
        case CimPackage.SPECIMEN__AMBIENT_TEMPERATURE_AT_SAMPLING:
            setAmbientTemperatureAtSampling( ( Float ) newValue );
            return;
        case CimPackage.SPECIMEN__HUMIDITY_AT_SAMPLING:
            setHumidityAtSampling( ( Float ) newValue );
            return;
        case CimPackage.SPECIMEN__SPECIMEN_ID:
            setSpecimenID( ( String ) newValue );
            return;
        case CimPackage.SPECIMEN__SPECIMEN_SAMPLE_DATE_TIME:
            setSpecimenSampleDateTime( ( Date ) newValue );
            return;
        case CimPackage.SPECIMEN__SPECIMEN_TO_LAB_DATE_TIME:
            setSpecimenToLabDateTime( ( Date ) newValue );
            return;
        case CimPackage.SPECIMEN__LAB_TEST_DATA_SET:
            getLabTestDataSet().clear();
            getLabTestDataSet().addAll( ( Collection< ? extends LabTestDataSet > ) newValue );
            return;
        case CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER:
            setAssetTestSampleTaker( ( AssetTestSampleTaker ) newValue );
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
        case CimPackage.SPECIMEN__AMBIENT_TEMPERATURE_AT_SAMPLING:
            unsetAmbientTemperatureAtSampling();
            return;
        case CimPackage.SPECIMEN__HUMIDITY_AT_SAMPLING:
            unsetHumidityAtSampling();
            return;
        case CimPackage.SPECIMEN__SPECIMEN_ID:
            unsetSpecimenID();
            return;
        case CimPackage.SPECIMEN__SPECIMEN_SAMPLE_DATE_TIME:
            unsetSpecimenSampleDateTime();
            return;
        case CimPackage.SPECIMEN__SPECIMEN_TO_LAB_DATE_TIME:
            unsetSpecimenToLabDateTime();
            return;
        case CimPackage.SPECIMEN__LAB_TEST_DATA_SET:
            unsetLabTestDataSet();
            return;
        case CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER:
            unsetAssetTestSampleTaker();
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
        case CimPackage.SPECIMEN__AMBIENT_TEMPERATURE_AT_SAMPLING:
            return isSetAmbientTemperatureAtSampling();
        case CimPackage.SPECIMEN__HUMIDITY_AT_SAMPLING:
            return isSetHumidityAtSampling();
        case CimPackage.SPECIMEN__SPECIMEN_ID:
            return isSetSpecimenID();
        case CimPackage.SPECIMEN__SPECIMEN_SAMPLE_DATE_TIME:
            return isSetSpecimenSampleDateTime();
        case CimPackage.SPECIMEN__SPECIMEN_TO_LAB_DATE_TIME:
            return isSetSpecimenToLabDateTime();
        case CimPackage.SPECIMEN__LAB_TEST_DATA_SET:
            return isSetLabTestDataSet();
        case CimPackage.SPECIMEN__ASSET_TEST_SAMPLE_TAKER:
            return isSetAssetTestSampleTaker();
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
        result.append( " (ambientTemperatureAtSampling: " );
        if( ambientTemperatureAtSamplingESet )
            result.append( ambientTemperatureAtSampling );
        else
            result.append( "<unset>" );
        result.append( ", humidityAtSampling: " );
        if( humidityAtSamplingESet )
            result.append( humidityAtSampling );
        else
            result.append( "<unset>" );
        result.append( ", specimenID: " );
        if( specimenIDESet )
            result.append( specimenID );
        else
            result.append( "<unset>" );
        result.append( ", specimenSampleDateTime: " );
        if( specimenSampleDateTimeESet )
            result.append( specimenSampleDateTime );
        else
            result.append( "<unset>" );
        result.append( ", specimenToLabDateTime: " );
        if( specimenToLabDateTimeESet )
            result.append( specimenToLabDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SpecimenImpl
