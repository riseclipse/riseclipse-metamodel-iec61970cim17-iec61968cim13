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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CapabilityKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PredictionIntervalKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions;

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
 * An implementation of the model object '<em><b>DER Group Forecast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastImpl#getCapabilityKind <em>Capability Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastImpl#getPredictionCreationDate <em>Prediction Creation Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastImpl#getPredictionIntervalKind <em>Prediction Interval Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastImpl#getPredictionStartDate <em>Prediction Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastImpl#getPredictions <em>Predictions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastImpl#getEndDeviceGroup <em>End Device Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DERGroupForecastImpl extends IdentifiedObjectImpl implements DERGroupForecast {
    /**
     * The default value of the '{@link #getCapabilityKind() <em>Capability Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityKind()
     * @generated
     * @ordered
     */
    protected static final CapabilityKind CAPABILITY_KIND_EDEFAULT = CapabilityKind.APPARENT_POWER;

    /**
     * The cached value of the '{@link #getCapabilityKind() <em>Capability Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityKind()
     * @generated
     * @ordered
     */
    protected CapabilityKind capabilityKind = CAPABILITY_KIND_EDEFAULT;

    /**
     * This is true if the Capability Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityKindESet;

    /**
     * The default value of the '{@link #getPredictionCreationDate() <em>Prediction Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictionCreationDate()
     * @generated
     * @ordered
     */
    protected static final Date PREDICTION_CREATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPredictionCreationDate() <em>Prediction Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictionCreationDate()
     * @generated
     * @ordered
     */
    protected Date predictionCreationDate = PREDICTION_CREATION_DATE_EDEFAULT;

    /**
     * This is true if the Prediction Creation Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean predictionCreationDateESet;

    /**
     * The default value of the '{@link #getPredictionIntervalKind() <em>Prediction Interval Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictionIntervalKind()
     * @generated
     * @ordered
     */
    protected static final PredictionIntervalKind PREDICTION_INTERVAL_KIND_EDEFAULT = PredictionIntervalKind.Y;

    /**
     * The cached value of the '{@link #getPredictionIntervalKind() <em>Prediction Interval Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictionIntervalKind()
     * @generated
     * @ordered
     */
    protected PredictionIntervalKind predictionIntervalKind = PREDICTION_INTERVAL_KIND_EDEFAULT;

    /**
     * This is true if the Prediction Interval Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean predictionIntervalKindESet;

    /**
     * The default value of the '{@link #getPredictionStartDate() <em>Prediction Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictionStartDate()
     * @generated
     * @ordered
     */
    protected static final Date PREDICTION_START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPredictionStartDate() <em>Prediction Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictionStartDate()
     * @generated
     * @ordered
     */
    protected Date predictionStartDate = PREDICTION_START_DATE_EDEFAULT;

    /**
     * This is true if the Prediction Start Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean predictionStartDateESet;

    /**
     * The cached value of the '{@link #getPredictions() <em>Predictions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictions()
     * @generated
     * @ordered
     */
    protected EList< Predictions > predictions;

    /**
     * The cached value of the '{@link #getEndDeviceGroup() <em>End Device Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceGroup()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceGroup > endDeviceGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DERGroupForecastImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDERGroupForecast();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CapabilityKind getCapabilityKind() {
        return capabilityKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapabilityKind( CapabilityKind newCapabilityKind ) {
        CapabilityKind oldCapabilityKind = capabilityKind;
        capabilityKind = newCapabilityKind == null ? CAPABILITY_KIND_EDEFAULT : newCapabilityKind;
        boolean oldCapabilityKindESet = capabilityKindESet;
        capabilityKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DER_GROUP_FORECAST__CAPABILITY_KIND,
                    oldCapabilityKind, capabilityKind, !oldCapabilityKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapabilityKind() {
        CapabilityKind oldCapabilityKind = capabilityKind;
        boolean oldCapabilityKindESet = capabilityKindESet;
        capabilityKind = CAPABILITY_KIND_EDEFAULT;
        capabilityKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DER_GROUP_FORECAST__CAPABILITY_KIND,
                    oldCapabilityKind, CAPABILITY_KIND_EDEFAULT, oldCapabilityKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilityKind() {
        return capabilityKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getPredictionCreationDate() {
        return predictionCreationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPredictionCreationDate( Date newPredictionCreationDate ) {
        Date oldPredictionCreationDate = predictionCreationDate;
        predictionCreationDate = newPredictionCreationDate;
        boolean oldPredictionCreationDateESet = predictionCreationDateESet;
        predictionCreationDateESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.DER_GROUP_FORECAST__PREDICTION_CREATION_DATE,
                        oldPredictionCreationDate, predictionCreationDate, !oldPredictionCreationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPredictionCreationDate() {
        Date oldPredictionCreationDate = predictionCreationDate;
        boolean oldPredictionCreationDateESet = predictionCreationDateESet;
        predictionCreationDate = PREDICTION_CREATION_DATE_EDEFAULT;
        predictionCreationDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DER_GROUP_FORECAST__PREDICTION_CREATION_DATE, oldPredictionCreationDate,
                PREDICTION_CREATION_DATE_EDEFAULT, oldPredictionCreationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPredictionCreationDate() {
        return predictionCreationDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PredictionIntervalKind getPredictionIntervalKind() {
        return predictionIntervalKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPredictionIntervalKind( PredictionIntervalKind newPredictionIntervalKind ) {
        PredictionIntervalKind oldPredictionIntervalKind = predictionIntervalKind;
        predictionIntervalKind = newPredictionIntervalKind == null ? PREDICTION_INTERVAL_KIND_EDEFAULT
                : newPredictionIntervalKind;
        boolean oldPredictionIntervalKindESet = predictionIntervalKindESet;
        predictionIntervalKindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.DER_GROUP_FORECAST__PREDICTION_INTERVAL_KIND,
                        oldPredictionIntervalKind, predictionIntervalKind, !oldPredictionIntervalKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPredictionIntervalKind() {
        PredictionIntervalKind oldPredictionIntervalKind = predictionIntervalKind;
        boolean oldPredictionIntervalKindESet = predictionIntervalKindESet;
        predictionIntervalKind = PREDICTION_INTERVAL_KIND_EDEFAULT;
        predictionIntervalKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DER_GROUP_FORECAST__PREDICTION_INTERVAL_KIND, oldPredictionIntervalKind,
                PREDICTION_INTERVAL_KIND_EDEFAULT, oldPredictionIntervalKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPredictionIntervalKind() {
        return predictionIntervalKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getPredictionStartDate() {
        return predictionStartDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPredictionStartDate( Date newPredictionStartDate ) {
        Date oldPredictionStartDate = predictionStartDate;
        predictionStartDate = newPredictionStartDate;
        boolean oldPredictionStartDateESet = predictionStartDateESet;
        predictionStartDateESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.DER_GROUP_FORECAST__PREDICTION_START_DATE,
                        oldPredictionStartDate, predictionStartDate, !oldPredictionStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPredictionStartDate() {
        Date oldPredictionStartDate = predictionStartDate;
        boolean oldPredictionStartDateESet = predictionStartDateESet;
        predictionStartDate = PREDICTION_START_DATE_EDEFAULT;
        predictionStartDateESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.DER_GROUP_FORECAST__PREDICTION_START_DATE,
                        oldPredictionStartDate, PREDICTION_START_DATE_EDEFAULT, oldPredictionStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPredictionStartDate() {
        return predictionStartDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Predictions > getPredictions() {
        if( predictions == null ) {
            predictions = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Predictions >( Predictions.class,
                    this, CimPackage.DER_GROUP_FORECAST__PREDICTIONS, CimPackage.PREDICTIONS__DER_GROUP_FORECAST );
        }
        return predictions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPredictions() {
        if( predictions != null ) ( ( InternalEList.Unsettable< ? > ) predictions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPredictions() {
        return predictions != null && ( ( InternalEList.Unsettable< ? > ) predictions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceGroup > getEndDeviceGroup() {
        if( endDeviceGroup == null ) {
            endDeviceGroup = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDeviceGroup >(
                    EndDeviceGroup.class, this, CimPackage.DER_GROUP_FORECAST__END_DEVICE_GROUP,
                    CimPackage.END_DEVICE_GROUP__DER_GROUP_FORECAST );
        }
        return endDeviceGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceGroup() {
        if( endDeviceGroup != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceGroup ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceGroup() {
        return endDeviceGroup != null && ( ( InternalEList.Unsettable< ? > ) endDeviceGroup ).isSet();
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
        case CimPackage.DER_GROUP_FORECAST__PREDICTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPredictions() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.DER_GROUP_FORECAST__END_DEVICE_GROUP:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceGroup() )
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
        case CimPackage.DER_GROUP_FORECAST__PREDICTIONS:
            return ( ( InternalEList< ? > ) getPredictions() ).basicRemove( otherEnd, msgs );
        case CimPackage.DER_GROUP_FORECAST__END_DEVICE_GROUP:
            return ( ( InternalEList< ? > ) getEndDeviceGroup() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.DER_GROUP_FORECAST__CAPABILITY_KIND:
            return getCapabilityKind();
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_CREATION_DATE:
            return getPredictionCreationDate();
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_INTERVAL_KIND:
            return getPredictionIntervalKind();
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_START_DATE:
            return getPredictionStartDate();
        case CimPackage.DER_GROUP_FORECAST__PREDICTIONS:
            return getPredictions();
        case CimPackage.DER_GROUP_FORECAST__END_DEVICE_GROUP:
            return getEndDeviceGroup();
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
        case CimPackage.DER_GROUP_FORECAST__CAPABILITY_KIND:
            setCapabilityKind( ( CapabilityKind ) newValue );
            return;
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_CREATION_DATE:
            setPredictionCreationDate( ( Date ) newValue );
            return;
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_INTERVAL_KIND:
            setPredictionIntervalKind( ( PredictionIntervalKind ) newValue );
            return;
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_START_DATE:
            setPredictionStartDate( ( Date ) newValue );
            return;
        case CimPackage.DER_GROUP_FORECAST__PREDICTIONS:
            getPredictions().clear();
            getPredictions().addAll( ( Collection< ? extends Predictions > ) newValue );
            return;
        case CimPackage.DER_GROUP_FORECAST__END_DEVICE_GROUP:
            getEndDeviceGroup().clear();
            getEndDeviceGroup().addAll( ( Collection< ? extends EndDeviceGroup > ) newValue );
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
        case CimPackage.DER_GROUP_FORECAST__CAPABILITY_KIND:
            unsetCapabilityKind();
            return;
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_CREATION_DATE:
            unsetPredictionCreationDate();
            return;
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_INTERVAL_KIND:
            unsetPredictionIntervalKind();
            return;
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_START_DATE:
            unsetPredictionStartDate();
            return;
        case CimPackage.DER_GROUP_FORECAST__PREDICTIONS:
            unsetPredictions();
            return;
        case CimPackage.DER_GROUP_FORECAST__END_DEVICE_GROUP:
            unsetEndDeviceGroup();
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
        case CimPackage.DER_GROUP_FORECAST__CAPABILITY_KIND:
            return isSetCapabilityKind();
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_CREATION_DATE:
            return isSetPredictionCreationDate();
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_INTERVAL_KIND:
            return isSetPredictionIntervalKind();
        case CimPackage.DER_GROUP_FORECAST__PREDICTION_START_DATE:
            return isSetPredictionStartDate();
        case CimPackage.DER_GROUP_FORECAST__PREDICTIONS:
            return isSetPredictions();
        case CimPackage.DER_GROUP_FORECAST__END_DEVICE_GROUP:
            return isSetEndDeviceGroup();
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
        result.append( " (capabilityKind: " );
        if( capabilityKindESet )
            result.append( capabilityKind );
        else
            result.append( "<unset>" );
        result.append( ", predictionCreationDate: " );
        if( predictionCreationDateESet )
            result.append( predictionCreationDate );
        else
            result.append( "<unset>" );
        result.append( ", predictionIntervalKind: " );
        if( predictionIntervalKindESet )
            result.append( predictionIntervalKind );
        else
            result.append( "<unset>" );
        result.append( ", predictionStartDate: " );
        if( predictionStartDateESet )
            result.append( predictionStartDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DERGroupForecastImpl
