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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecastRequest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PredictionIntervalKind;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DER Group Forecast Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastRequestImpl#getCapabilityKind <em>Capability Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastRequestImpl#getForecastBeginDate <em>Forecast Begin Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastRequestImpl#getForecastInterval <em>Forecast Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupForecastRequestImpl#getForecastIntervalQty <em>Forecast Interval Qty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DERGroupForecastRequestImpl extends IdentifiedObjectImpl implements DERGroupForecastRequest {
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
     * The default value of the '{@link #getForecastBeginDate() <em>Forecast Begin Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForecastBeginDate()
     * @generated
     * @ordered
     */
    protected static final Date FORECAST_BEGIN_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getForecastBeginDate() <em>Forecast Begin Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForecastBeginDate()
     * @generated
     * @ordered
     */
    protected Date forecastBeginDate = FORECAST_BEGIN_DATE_EDEFAULT;

    /**
     * This is true if the Forecast Begin Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean forecastBeginDateESet;

    /**
     * The default value of the '{@link #getForecastInterval() <em>Forecast Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForecastInterval()
     * @generated
     * @ordered
     */
    protected static final PredictionIntervalKind FORECAST_INTERVAL_EDEFAULT = PredictionIntervalKind.Y;

    /**
     * The cached value of the '{@link #getForecastInterval() <em>Forecast Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForecastInterval()
     * @generated
     * @ordered
     */
    protected PredictionIntervalKind forecastInterval = FORECAST_INTERVAL_EDEFAULT;

    /**
     * This is true if the Forecast Interval attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean forecastIntervalESet;

    /**
     * The default value of the '{@link #getForecastIntervalQty() <em>Forecast Interval Qty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForecastIntervalQty()
     * @generated
     * @ordered
     */
    protected static final Integer FORECAST_INTERVAL_QTY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getForecastIntervalQty() <em>Forecast Interval Qty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForecastIntervalQty()
     * @generated
     * @ordered
     */
    protected Integer forecastIntervalQty = FORECAST_INTERVAL_QTY_EDEFAULT;

    /**
     * This is true if the Forecast Interval Qty attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean forecastIntervalQtyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DERGroupForecastRequestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDERGroupForecastRequest();
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.DER_GROUP_FORECAST_REQUEST__CAPABILITY_KIND,
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.DER_GROUP_FORECAST_REQUEST__CAPABILITY_KIND,
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
    public Date getForecastBeginDate() {
        return forecastBeginDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setForecastBeginDate( Date newForecastBeginDate ) {
        Date oldForecastBeginDate = forecastBeginDate;
        forecastBeginDate = newForecastBeginDate;
        boolean oldForecastBeginDateESet = forecastBeginDateESet;
        forecastBeginDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_BEGIN_DATE, oldForecastBeginDate, forecastBeginDate,
                !oldForecastBeginDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetForecastBeginDate() {
        Date oldForecastBeginDate = forecastBeginDate;
        boolean oldForecastBeginDateESet = forecastBeginDateESet;
        forecastBeginDate = FORECAST_BEGIN_DATE_EDEFAULT;
        forecastBeginDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_BEGIN_DATE, oldForecastBeginDate,
                FORECAST_BEGIN_DATE_EDEFAULT, oldForecastBeginDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetForecastBeginDate() {
        return forecastBeginDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PredictionIntervalKind getForecastInterval() {
        return forecastInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setForecastInterval( PredictionIntervalKind newForecastInterval ) {
        PredictionIntervalKind oldForecastInterval = forecastInterval;
        forecastInterval = newForecastInterval == null ? FORECAST_INTERVAL_EDEFAULT : newForecastInterval;
        boolean oldForecastIntervalESet = forecastIntervalESet;
        forecastIntervalESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL,
                        oldForecastInterval, forecastInterval, !oldForecastIntervalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetForecastInterval() {
        PredictionIntervalKind oldForecastInterval = forecastInterval;
        boolean oldForecastIntervalESet = forecastIntervalESet;
        forecastInterval = FORECAST_INTERVAL_EDEFAULT;
        forecastIntervalESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL, oldForecastInterval,
                FORECAST_INTERVAL_EDEFAULT, oldForecastIntervalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetForecastInterval() {
        return forecastIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getForecastIntervalQty() {
        return forecastIntervalQty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setForecastIntervalQty( Integer newForecastIntervalQty ) {
        Integer oldForecastIntervalQty = forecastIntervalQty;
        forecastIntervalQty = newForecastIntervalQty;
        boolean oldForecastIntervalQtyESet = forecastIntervalQtyESet;
        forecastIntervalQtyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL_QTY, oldForecastIntervalQty,
                forecastIntervalQty, !oldForecastIntervalQtyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetForecastIntervalQty() {
        Integer oldForecastIntervalQty = forecastIntervalQty;
        boolean oldForecastIntervalQtyESet = forecastIntervalQtyESet;
        forecastIntervalQty = FORECAST_INTERVAL_QTY_EDEFAULT;
        forecastIntervalQtyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL_QTY, oldForecastIntervalQty,
                FORECAST_INTERVAL_QTY_EDEFAULT, oldForecastIntervalQtyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetForecastIntervalQty() {
        return forecastIntervalQtyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DER_GROUP_FORECAST_REQUEST__CAPABILITY_KIND:
            return getCapabilityKind();
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_BEGIN_DATE:
            return getForecastBeginDate();
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL:
            return getForecastInterval();
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL_QTY:
            return getForecastIntervalQty();
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
        case CimPackage.DER_GROUP_FORECAST_REQUEST__CAPABILITY_KIND:
            setCapabilityKind( ( CapabilityKind ) newValue );
            return;
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_BEGIN_DATE:
            setForecastBeginDate( ( Date ) newValue );
            return;
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL:
            setForecastInterval( ( PredictionIntervalKind ) newValue );
            return;
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL_QTY:
            setForecastIntervalQty( ( Integer ) newValue );
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
        case CimPackage.DER_GROUP_FORECAST_REQUEST__CAPABILITY_KIND:
            unsetCapabilityKind();
            return;
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_BEGIN_DATE:
            unsetForecastBeginDate();
            return;
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL:
            unsetForecastInterval();
            return;
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL_QTY:
            unsetForecastIntervalQty();
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
        case CimPackage.DER_GROUP_FORECAST_REQUEST__CAPABILITY_KIND:
            return isSetCapabilityKind();
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_BEGIN_DATE:
            return isSetForecastBeginDate();
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL:
            return isSetForecastInterval();
        case CimPackage.DER_GROUP_FORECAST_REQUEST__FORECAST_INTERVAL_QTY:
            return isSetForecastIntervalQty();
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
        result.append( ", forecastBeginDate: " );
        if( forecastBeginDateESet )
            result.append( forecastBeginDate );
        else
            result.append( "<unset>" );
        result.append( ", forecastInterval: " );
        if( forecastIntervalESet )
            result.append( forecastInterval );
        else
            result.append( "<unset>" );
        result.append( ", forecastIntervalQty: " );
        if( forecastIntervalQtyESet )
            result.append( forecastIntervalQty );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DERGroupForecastRequestImpl
