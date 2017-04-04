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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSampleLocation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilSpecimen;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OilTemperatureSource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SampleContainerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oil Specimen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OilSpecimenImpl#getOilSampleTakenFrom <em>Oil Sample Taken From</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OilSpecimenImpl#getOilSampleTemperature <em>Oil Sample Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OilSpecimenImpl#getOilTemperatureSource <em>Oil Temperature Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OilSpecimenImpl#getSampleContainer <em>Sample Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OilSpecimenImpl extends SpecimenImpl implements OilSpecimen {
    /**
     * The default value of the '{@link #getOilSampleTakenFrom() <em>Oil Sample Taken From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOilSampleTakenFrom()
     * @generated
     * @ordered
     */
    protected static final OilSampleLocation OIL_SAMPLE_TAKEN_FROM_EDEFAULT = OilSampleLocation.OIL_SAMPLE_VALVE;

    /**
     * The cached value of the '{@link #getOilSampleTakenFrom() <em>Oil Sample Taken From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOilSampleTakenFrom()
     * @generated
     * @ordered
     */
    protected OilSampleLocation oilSampleTakenFrom = OIL_SAMPLE_TAKEN_FROM_EDEFAULT;

    /**
     * This is true if the Oil Sample Taken From attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oilSampleTakenFromESet;

    /**
     * The default value of the '{@link #getOilSampleTemperature() <em>Oil Sample Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOilSampleTemperature()
     * @generated
     * @ordered
     */
    protected static final Float OIL_SAMPLE_TEMPERATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOilSampleTemperature() <em>Oil Sample Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOilSampleTemperature()
     * @generated
     * @ordered
     */
    protected Float oilSampleTemperature = OIL_SAMPLE_TEMPERATURE_EDEFAULT;

    /**
     * This is true if the Oil Sample Temperature attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oilSampleTemperatureESet;

    /**
     * The default value of the '{@link #getOilTemperatureSource() <em>Oil Temperature Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOilTemperatureSource()
     * @generated
     * @ordered
     */
    protected static final OilTemperatureSource OIL_TEMPERATURE_SOURCE_EDEFAULT = OilTemperatureSource.TOP_OIL_TEMPERATURE_GAUGE;

    /**
     * The cached value of the '{@link #getOilTemperatureSource() <em>Oil Temperature Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOilTemperatureSource()
     * @generated
     * @ordered
     */
    protected OilTemperatureSource oilTemperatureSource = OIL_TEMPERATURE_SOURCE_EDEFAULT;

    /**
     * This is true if the Oil Temperature Source attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oilTemperatureSourceESet;

    /**
     * The default value of the '{@link #getSampleContainer() <em>Sample Container</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSampleContainer()
     * @generated
     * @ordered
     */
    protected static final SampleContainerType SAMPLE_CONTAINER_EDEFAULT = SampleContainerType.GLASS_CAN;

    /**
     * The cached value of the '{@link #getSampleContainer() <em>Sample Container</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSampleContainer()
     * @generated
     * @ordered
     */
    protected SampleContainerType sampleContainer = SAMPLE_CONTAINER_EDEFAULT;

    /**
     * This is true if the Sample Container attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sampleContainerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OilSpecimenImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOilSpecimen();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OilSampleLocation getOilSampleTakenFrom() {
        return oilSampleTakenFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOilSampleTakenFrom( OilSampleLocation newOilSampleTakenFrom ) {
        OilSampleLocation oldOilSampleTakenFrom = oilSampleTakenFrom;
        oilSampleTakenFrom = newOilSampleTakenFrom == null ? OIL_SAMPLE_TAKEN_FROM_EDEFAULT : newOilSampleTakenFrom;
        boolean oldOilSampleTakenFromESet = oilSampleTakenFromESet;
        oilSampleTakenFromESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TAKEN_FROM,
                    oldOilSampleTakenFrom, oilSampleTakenFrom, !oldOilSampleTakenFromESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOilSampleTakenFrom() {
        OilSampleLocation oldOilSampleTakenFrom = oilSampleTakenFrom;
        boolean oldOilSampleTakenFromESet = oilSampleTakenFromESet;
        oilSampleTakenFrom = OIL_SAMPLE_TAKEN_FROM_EDEFAULT;
        oilSampleTakenFromESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TAKEN_FROM,
                    oldOilSampleTakenFrom, OIL_SAMPLE_TAKEN_FROM_EDEFAULT, oldOilSampleTakenFromESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOilSampleTakenFrom() {
        return oilSampleTakenFromESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOilSampleTemperature() {
        return oilSampleTemperature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOilSampleTemperature( Float newOilSampleTemperature ) {
        Float oldOilSampleTemperature = oilSampleTemperature;
        oilSampleTemperature = newOilSampleTemperature;
        boolean oldOilSampleTemperatureESet = oilSampleTemperatureESet;
        oilSampleTemperatureESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TEMPERATURE,
                    oldOilSampleTemperature, oilSampleTemperature, !oldOilSampleTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOilSampleTemperature() {
        Float oldOilSampleTemperature = oilSampleTemperature;
        boolean oldOilSampleTemperatureESet = oilSampleTemperatureESet;
        oilSampleTemperature = OIL_SAMPLE_TEMPERATURE_EDEFAULT;
        oilSampleTemperatureESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TEMPERATURE,
                    oldOilSampleTemperature, OIL_SAMPLE_TEMPERATURE_EDEFAULT, oldOilSampleTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOilSampleTemperature() {
        return oilSampleTemperatureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OilTemperatureSource getOilTemperatureSource() {
        return oilTemperatureSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOilTemperatureSource( OilTemperatureSource newOilTemperatureSource ) {
        OilTemperatureSource oldOilTemperatureSource = oilTemperatureSource;
        oilTemperatureSource = newOilTemperatureSource == null ? OIL_TEMPERATURE_SOURCE_EDEFAULT
                : newOilTemperatureSource;
        boolean oldOilTemperatureSourceESet = oilTemperatureSourceESet;
        oilTemperatureSourceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OIL_SPECIMEN__OIL_TEMPERATURE_SOURCE,
                    oldOilTemperatureSource, oilTemperatureSource, !oldOilTemperatureSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOilTemperatureSource() {
        OilTemperatureSource oldOilTemperatureSource = oilTemperatureSource;
        boolean oldOilTemperatureSourceESet = oilTemperatureSourceESet;
        oilTemperatureSource = OIL_TEMPERATURE_SOURCE_EDEFAULT;
        oilTemperatureSourceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OIL_SPECIMEN__OIL_TEMPERATURE_SOURCE,
                    oldOilTemperatureSource, OIL_TEMPERATURE_SOURCE_EDEFAULT, oldOilTemperatureSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOilTemperatureSource() {
        return oilTemperatureSourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SampleContainerType getSampleContainer() {
        return sampleContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSampleContainer( SampleContainerType newSampleContainer ) {
        SampleContainerType oldSampleContainer = sampleContainer;
        sampleContainer = newSampleContainer == null ? SAMPLE_CONTAINER_EDEFAULT : newSampleContainer;
        boolean oldSampleContainerESet = sampleContainerESet;
        sampleContainerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OIL_SPECIMEN__SAMPLE_CONTAINER,
                    oldSampleContainer, sampleContainer, !oldSampleContainerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSampleContainer() {
        SampleContainerType oldSampleContainer = sampleContainer;
        boolean oldSampleContainerESet = sampleContainerESet;
        sampleContainer = SAMPLE_CONTAINER_EDEFAULT;
        sampleContainerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OIL_SPECIMEN__SAMPLE_CONTAINER,
                    oldSampleContainer, SAMPLE_CONTAINER_EDEFAULT, oldSampleContainerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSampleContainer() {
        return sampleContainerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TAKEN_FROM:
            return getOilSampleTakenFrom();
        case CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TEMPERATURE:
            return getOilSampleTemperature();
        case CimPackage.OIL_SPECIMEN__OIL_TEMPERATURE_SOURCE:
            return getOilTemperatureSource();
        case CimPackage.OIL_SPECIMEN__SAMPLE_CONTAINER:
            return getSampleContainer();
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
        case CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TAKEN_FROM:
            setOilSampleTakenFrom( ( OilSampleLocation ) newValue );
            return;
        case CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TEMPERATURE:
            setOilSampleTemperature( ( Float ) newValue );
            return;
        case CimPackage.OIL_SPECIMEN__OIL_TEMPERATURE_SOURCE:
            setOilTemperatureSource( ( OilTemperatureSource ) newValue );
            return;
        case CimPackage.OIL_SPECIMEN__SAMPLE_CONTAINER:
            setSampleContainer( ( SampleContainerType ) newValue );
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
        case CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TAKEN_FROM:
            unsetOilSampleTakenFrom();
            return;
        case CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TEMPERATURE:
            unsetOilSampleTemperature();
            return;
        case CimPackage.OIL_SPECIMEN__OIL_TEMPERATURE_SOURCE:
            unsetOilTemperatureSource();
            return;
        case CimPackage.OIL_SPECIMEN__SAMPLE_CONTAINER:
            unsetSampleContainer();
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
        case CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TAKEN_FROM:
            return isSetOilSampleTakenFrom();
        case CimPackage.OIL_SPECIMEN__OIL_SAMPLE_TEMPERATURE:
            return isSetOilSampleTemperature();
        case CimPackage.OIL_SPECIMEN__OIL_TEMPERATURE_SOURCE:
            return isSetOilTemperatureSource();
        case CimPackage.OIL_SPECIMEN__SAMPLE_CONTAINER:
            return isSetSampleContainer();
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
        result.append( " (oilSampleTakenFrom: " );
        if( oilSampleTakenFromESet )
            result.append( oilSampleTakenFrom );
        else
            result.append( "<unset>" );
        result.append( ", oilSampleTemperature: " );
        if( oilSampleTemperatureESet )
            result.append( oilSampleTemperature );
        else
            result.append( "<unset>" );
        result.append( ", oilTemperatureSource: " );
        if( oilTemperatureSourceESet )
            result.append( oilTemperatureSource );
        else
            result.append( "<unset>" );
        result.append( ", sampleContainer: " );
        if( sampleContainerESet )
            result.append( sampleContainer );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OilSpecimenImpl
