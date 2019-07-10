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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoilModeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petersen Coil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PetersenCoilImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PetersenCoilImpl#getNominalU <em>Nominal U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PetersenCoilImpl#getOffsetCurrent <em>Offset Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PetersenCoilImpl#getPositionCurrent <em>Position Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PetersenCoilImpl#getXGroundMax <em>XGround Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PetersenCoilImpl#getXGroundMin <em>XGround Min</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PetersenCoilImpl#getXGroundNominal <em>XGround Nominal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PetersenCoilImpl extends EarthFaultCompensatorImpl implements PetersenCoil {
    /**
     * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected static final PetersenCoilModeKind MODE_EDEFAULT = PetersenCoilModeKind.FIXED;

    /**
     * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected PetersenCoilModeKind mode = MODE_EDEFAULT;

    /**
     * This is true if the Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modeESet;

    /**
     * The default value of the '{@link #getNominalU() <em>Nominal U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalU()
     * @generated
     * @ordered
     */
    protected static final Float NOMINAL_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalU() <em>Nominal U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalU()
     * @generated
     * @ordered
     */
    protected Float nominalU = NOMINAL_U_EDEFAULT;

    /**
     * This is true if the Nominal U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalUESet;

    /**
     * The default value of the '{@link #getOffsetCurrent() <em>Offset Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetCurrent()
     * @generated
     * @ordered
     */
    protected static final Float OFFSET_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOffsetCurrent() <em>Offset Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetCurrent()
     * @generated
     * @ordered
     */
    protected Float offsetCurrent = OFFSET_CURRENT_EDEFAULT;

    /**
     * This is true if the Offset Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean offsetCurrentESet;

    /**
     * The default value of the '{@link #getPositionCurrent() <em>Position Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositionCurrent()
     * @generated
     * @ordered
     */
    protected static final Float POSITION_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPositionCurrent() <em>Position Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositionCurrent()
     * @generated
     * @ordered
     */
    protected Float positionCurrent = POSITION_CURRENT_EDEFAULT;

    /**
     * This is true if the Position Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positionCurrentESet;

    /**
     * The default value of the '{@link #getXGroundMax() <em>XGround Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXGroundMax()
     * @generated
     * @ordered
     */
    protected static final Float XGROUND_MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXGroundMax() <em>XGround Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXGroundMax()
     * @generated
     * @ordered
     */
    protected Float xGroundMax = XGROUND_MAX_EDEFAULT;

    /**
     * This is true if the XGround Max attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xGroundMaxESet;

    /**
     * The default value of the '{@link #getXGroundMin() <em>XGround Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXGroundMin()
     * @generated
     * @ordered
     */
    protected static final Float XGROUND_MIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXGroundMin() <em>XGround Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXGroundMin()
     * @generated
     * @ordered
     */
    protected Float xGroundMin = XGROUND_MIN_EDEFAULT;

    /**
     * This is true if the XGround Min attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xGroundMinESet;

    /**
     * The default value of the '{@link #getXGroundNominal() <em>XGround Nominal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXGroundNominal()
     * @generated
     * @ordered
     */
    protected static final Float XGROUND_NOMINAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXGroundNominal() <em>XGround Nominal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXGroundNominal()
     * @generated
     * @ordered
     */
    protected Float xGroundNominal = XGROUND_NOMINAL_EDEFAULT;

    /**
     * This is true if the XGround Nominal attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xGroundNominalESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PetersenCoilImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPetersenCoil();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PetersenCoilModeKind getMode() {
        return mode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMode( PetersenCoilModeKind newMode ) {
        PetersenCoilModeKind oldMode = mode;
        mode = newMode == null ? MODE_EDEFAULT : newMode;
        boolean oldModeESet = modeESet;
        modeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PETERSEN_COIL__MODE, oldMode, mode, !oldModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMode() {
        PetersenCoilModeKind oldMode = mode;
        boolean oldModeESet = modeESet;
        mode = MODE_EDEFAULT;
        modeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PETERSEN_COIL__MODE, oldMode, MODE_EDEFAULT, oldModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMode() {
        return modeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNominalU() {
        return nominalU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalU( Float newNominalU ) {
        Float oldNominalU = nominalU;
        nominalU = newNominalU;
        boolean oldNominalUESet = nominalUESet;
        nominalUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PETERSEN_COIL__NOMINAL_U, oldNominalU, nominalU, !oldNominalUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalU() {
        Float oldNominalU = nominalU;
        boolean oldNominalUESet = nominalUESet;
        nominalU = NOMINAL_U_EDEFAULT;
        nominalUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PETERSEN_COIL__NOMINAL_U, oldNominalU, NOMINAL_U_EDEFAULT, oldNominalUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalU() {
        return nominalUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOffsetCurrent() {
        return offsetCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOffsetCurrent( Float newOffsetCurrent ) {
        Float oldOffsetCurrent = offsetCurrent;
        offsetCurrent = newOffsetCurrent;
        boolean oldOffsetCurrentESet = offsetCurrentESet;
        offsetCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PETERSEN_COIL__OFFSET_CURRENT, oldOffsetCurrent, offsetCurrent, !oldOffsetCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOffsetCurrent() {
        Float oldOffsetCurrent = offsetCurrent;
        boolean oldOffsetCurrentESet = offsetCurrentESet;
        offsetCurrent = OFFSET_CURRENT_EDEFAULT;
        offsetCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PETERSEN_COIL__OFFSET_CURRENT,
                    oldOffsetCurrent, OFFSET_CURRENT_EDEFAULT, oldOffsetCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOffsetCurrent() {
        return offsetCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPositionCurrent() {
        return positionCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPositionCurrent( Float newPositionCurrent ) {
        Float oldPositionCurrent = positionCurrent;
        positionCurrent = newPositionCurrent;
        boolean oldPositionCurrentESet = positionCurrentESet;
        positionCurrentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PETERSEN_COIL__POSITION_CURRENT,
                    oldPositionCurrent, positionCurrent, !oldPositionCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositionCurrent() {
        Float oldPositionCurrent = positionCurrent;
        boolean oldPositionCurrentESet = positionCurrentESet;
        positionCurrent = POSITION_CURRENT_EDEFAULT;
        positionCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PETERSEN_COIL__POSITION_CURRENT,
                    oldPositionCurrent, POSITION_CURRENT_EDEFAULT, oldPositionCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositionCurrent() {
        return positionCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXGroundMax() {
        return xGroundMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXGroundMax( Float newXGroundMax ) {
        Float oldXGroundMax = xGroundMax;
        xGroundMax = newXGroundMax;
        boolean oldXGroundMaxESet = xGroundMaxESet;
        xGroundMaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PETERSEN_COIL__XGROUND_MAX, oldXGroundMax, xGroundMax, !oldXGroundMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXGroundMax() {
        Float oldXGroundMax = xGroundMax;
        boolean oldXGroundMaxESet = xGroundMaxESet;
        xGroundMax = XGROUND_MAX_EDEFAULT;
        xGroundMaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PETERSEN_COIL__XGROUND_MAX, oldXGroundMax, XGROUND_MAX_EDEFAULT, oldXGroundMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXGroundMax() {
        return xGroundMaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXGroundMin() {
        return xGroundMin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXGroundMin( Float newXGroundMin ) {
        Float oldXGroundMin = xGroundMin;
        xGroundMin = newXGroundMin;
        boolean oldXGroundMinESet = xGroundMinESet;
        xGroundMinESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PETERSEN_COIL__XGROUND_MIN, oldXGroundMin, xGroundMin, !oldXGroundMinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXGroundMin() {
        Float oldXGroundMin = xGroundMin;
        boolean oldXGroundMinESet = xGroundMinESet;
        xGroundMin = XGROUND_MIN_EDEFAULT;
        xGroundMinESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PETERSEN_COIL__XGROUND_MIN, oldXGroundMin, XGROUND_MIN_EDEFAULT, oldXGroundMinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXGroundMin() {
        return xGroundMinESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXGroundNominal() {
        return xGroundNominal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXGroundNominal( Float newXGroundNominal ) {
        Float oldXGroundNominal = xGroundNominal;
        xGroundNominal = newXGroundNominal;
        boolean oldXGroundNominalESet = xGroundNominalESet;
        xGroundNominalESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PETERSEN_COIL__XGROUND_NOMINAL,
                    oldXGroundNominal, xGroundNominal, !oldXGroundNominalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXGroundNominal() {
        Float oldXGroundNominal = xGroundNominal;
        boolean oldXGroundNominalESet = xGroundNominalESet;
        xGroundNominal = XGROUND_NOMINAL_EDEFAULT;
        xGroundNominalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PETERSEN_COIL__XGROUND_NOMINAL,
                    oldXGroundNominal, XGROUND_NOMINAL_EDEFAULT, oldXGroundNominalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXGroundNominal() {
        return xGroundNominalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PETERSEN_COIL__MODE:
            return getMode();
        case CimPackage.PETERSEN_COIL__NOMINAL_U:
            return getNominalU();
        case CimPackage.PETERSEN_COIL__OFFSET_CURRENT:
            return getOffsetCurrent();
        case CimPackage.PETERSEN_COIL__POSITION_CURRENT:
            return getPositionCurrent();
        case CimPackage.PETERSEN_COIL__XGROUND_MAX:
            return getXGroundMax();
        case CimPackage.PETERSEN_COIL__XGROUND_MIN:
            return getXGroundMin();
        case CimPackage.PETERSEN_COIL__XGROUND_NOMINAL:
            return getXGroundNominal();
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
        case CimPackage.PETERSEN_COIL__MODE:
            setMode( ( PetersenCoilModeKind ) newValue );
            return;
        case CimPackage.PETERSEN_COIL__NOMINAL_U:
            setNominalU( ( Float ) newValue );
            return;
        case CimPackage.PETERSEN_COIL__OFFSET_CURRENT:
            setOffsetCurrent( ( Float ) newValue );
            return;
        case CimPackage.PETERSEN_COIL__POSITION_CURRENT:
            setPositionCurrent( ( Float ) newValue );
            return;
        case CimPackage.PETERSEN_COIL__XGROUND_MAX:
            setXGroundMax( ( Float ) newValue );
            return;
        case CimPackage.PETERSEN_COIL__XGROUND_MIN:
            setXGroundMin( ( Float ) newValue );
            return;
        case CimPackage.PETERSEN_COIL__XGROUND_NOMINAL:
            setXGroundNominal( ( Float ) newValue );
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
        case CimPackage.PETERSEN_COIL__MODE:
            unsetMode();
            return;
        case CimPackage.PETERSEN_COIL__NOMINAL_U:
            unsetNominalU();
            return;
        case CimPackage.PETERSEN_COIL__OFFSET_CURRENT:
            unsetOffsetCurrent();
            return;
        case CimPackage.PETERSEN_COIL__POSITION_CURRENT:
            unsetPositionCurrent();
            return;
        case CimPackage.PETERSEN_COIL__XGROUND_MAX:
            unsetXGroundMax();
            return;
        case CimPackage.PETERSEN_COIL__XGROUND_MIN:
            unsetXGroundMin();
            return;
        case CimPackage.PETERSEN_COIL__XGROUND_NOMINAL:
            unsetXGroundNominal();
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
        case CimPackage.PETERSEN_COIL__MODE:
            return isSetMode();
        case CimPackage.PETERSEN_COIL__NOMINAL_U:
            return isSetNominalU();
        case CimPackage.PETERSEN_COIL__OFFSET_CURRENT:
            return isSetOffsetCurrent();
        case CimPackage.PETERSEN_COIL__POSITION_CURRENT:
            return isSetPositionCurrent();
        case CimPackage.PETERSEN_COIL__XGROUND_MAX:
            return isSetXGroundMax();
        case CimPackage.PETERSEN_COIL__XGROUND_MIN:
            return isSetXGroundMin();
        case CimPackage.PETERSEN_COIL__XGROUND_NOMINAL:
            return isSetXGroundNominal();
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
        result.append( " (mode: " );
        if( modeESet )
            result.append( mode );
        else
            result.append( "<unset>" );
        result.append( ", nominalU: " );
        if( nominalUESet )
            result.append( nominalU );
        else
            result.append( "<unset>" );
        result.append( ", offsetCurrent: " );
        if( offsetCurrentESet )
            result.append( offsetCurrent );
        else
            result.append( "<unset>" );
        result.append( ", positionCurrent: " );
        if( positionCurrentESet )
            result.append( positionCurrent );
        else
            result.append( "<unset>" );
        result.append( ", xGroundMax: " );
        if( xGroundMaxESet )
            result.append( xGroundMax );
        else
            result.append( "<unset>" );
        result.append( ", xGroundMin: " );
        if( xGroundMinESet )
            result.append( xGroundMin );
        else
            result.append( "<unset>" );
        result.append( ", xGroundNominal: " );
        if( xGroundNominalESet )
            result.append( xGroundNominal );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PetersenCoilImpl
