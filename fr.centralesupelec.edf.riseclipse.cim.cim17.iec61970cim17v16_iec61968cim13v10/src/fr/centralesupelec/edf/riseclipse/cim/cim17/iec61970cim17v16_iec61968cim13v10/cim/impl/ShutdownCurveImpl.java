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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShutdownCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shutdown Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShutdownCurveImpl#getShutdownCost <em>Shutdown Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShutdownCurveImpl#getShutdownDate <em>Shutdown Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShutdownCurveImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShutdownCurveImpl extends CurveImpl implements ShutdownCurve {
    /**
     * The default value of the '{@link #getShutdownCost() <em>Shutdown Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShutdownCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal SHUTDOWN_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShutdownCost() <em>Shutdown Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShutdownCost()
     * @generated
     * @ordered
     */
    protected BigDecimal shutdownCost = SHUTDOWN_COST_EDEFAULT;

    /**
     * This is true if the Shutdown Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shutdownCostESet;

    /**
     * The default value of the '{@link #getShutdownDate() <em>Shutdown Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShutdownDate()
     * @generated
     * @ordered
     */
    protected static final Date SHUTDOWN_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShutdownDate() <em>Shutdown Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShutdownDate()
     * @generated
     * @ordered
     */
    protected Date shutdownDate = SHUTDOWN_DATE_EDEFAULT;

    /**
     * This is true if the Shutdown Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shutdownDateESet;

    /**
     * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThermalGeneratingUnit()
     * @generated
     * @ordered
     */
    protected ThermalGeneratingUnit thermalGeneratingUnit;

    /**
     * This is true if the Thermal Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thermalGeneratingUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShutdownCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getShutdownCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getShutdownCost() {
        return shutdownCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShutdownCost( BigDecimal newShutdownCost ) {
        BigDecimal oldShutdownCost = shutdownCost;
        shutdownCost = newShutdownCost;
        boolean oldShutdownCostESet = shutdownCostESet;
        shutdownCostESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHUTDOWN_CURVE__SHUTDOWN_COST, oldShutdownCost, shutdownCost, !oldShutdownCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShutdownCost() {
        BigDecimal oldShutdownCost = shutdownCost;
        boolean oldShutdownCostESet = shutdownCostESet;
        shutdownCost = SHUTDOWN_COST_EDEFAULT;
        shutdownCostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUTDOWN_CURVE__SHUTDOWN_COST,
                    oldShutdownCost, SHUTDOWN_COST_EDEFAULT, oldShutdownCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShutdownCost() {
        return shutdownCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getShutdownDate() {
        return shutdownDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShutdownDate( Date newShutdownDate ) {
        Date oldShutdownDate = shutdownDate;
        shutdownDate = newShutdownDate;
        boolean oldShutdownDateESet = shutdownDateESet;
        shutdownDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE, oldShutdownDate, shutdownDate, !oldShutdownDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShutdownDate() {
        Date oldShutdownDate = shutdownDate;
        boolean oldShutdownDateESet = shutdownDateESet;
        shutdownDate = SHUTDOWN_DATE_EDEFAULT;
        shutdownDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE,
                    oldShutdownDate, SHUTDOWN_DATE_EDEFAULT, oldShutdownDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShutdownDate() {
        return shutdownDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThermalGeneratingUnit getThermalGeneratingUnit() {
        return thermalGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit,
            NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = newThermalGeneratingUnit;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit,
                    newThermalGeneratingUnit, !oldThermalGeneratingUnitESet );
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
    public void setThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit ) {
        if( newThermalGeneratingUnit != thermalGeneratingUnit ) {
            NotificationChain msgs = null;
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, ThermalGeneratingUnit.class, msgs );
            if( newThermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newThermalGeneratingUnit ).eInverseAdd( this,
                        CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, ThermalGeneratingUnit.class, msgs );
            msgs = basicSetThermalGeneratingUnit( newThermalGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT,
                            newThermalGeneratingUnit, newThermalGeneratingUnit, !oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetThermalGeneratingUnit( NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = null;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, null,
                    oldThermalGeneratingUnitESet );
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
    public void unsetThermalGeneratingUnit() {
        if( thermalGeneratingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                    CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, ThermalGeneratingUnit.class, msgs );
            msgs = basicUnsetThermalGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, null, null, oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalGeneratingUnit() {
        return thermalGeneratingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, ThermalGeneratingUnit.class, msgs );
            return basicSetThermalGeneratingUnit( ( ThermalGeneratingUnit ) otherEnd, msgs );
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
        case CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
            return basicUnsetThermalGeneratingUnit( msgs );
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
        case CimPackage.SHUTDOWN_CURVE__SHUTDOWN_COST:
            return getShutdownCost();
        case CimPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE:
            return getShutdownDate();
        case CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
            return getThermalGeneratingUnit();
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
        case CimPackage.SHUTDOWN_CURVE__SHUTDOWN_COST:
            setShutdownCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE:
            setShutdownDate( ( Date ) newValue );
            return;
        case CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
            setThermalGeneratingUnit( ( ThermalGeneratingUnit ) newValue );
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
        case CimPackage.SHUTDOWN_CURVE__SHUTDOWN_COST:
            unsetShutdownCost();
            return;
        case CimPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE:
            unsetShutdownDate();
            return;
        case CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
            unsetThermalGeneratingUnit();
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
        case CimPackage.SHUTDOWN_CURVE__SHUTDOWN_COST:
            return isSetShutdownCost();
        case CimPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE:
            return isSetShutdownDate();
        case CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
            return isSetThermalGeneratingUnit();
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
        result.append( " (shutdownCost: " );
        if( shutdownCostESet )
            result.append( shutdownCost );
        else
            result.append( "<unset>" );
        result.append( ", shutdownDate: " );
        if( shutdownDateESet )
            result.append( shutdownDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ShutdownCurveImpl
