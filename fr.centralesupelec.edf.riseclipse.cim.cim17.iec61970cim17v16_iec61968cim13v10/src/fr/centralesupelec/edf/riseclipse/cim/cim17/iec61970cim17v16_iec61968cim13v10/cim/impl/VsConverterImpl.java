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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsCapabilityCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsPpccControlKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsQpccControlKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vs Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getDelta <em>Delta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getDroop <em>Droop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getDroopCompensation <em>Droop Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getMaxModulationIndex <em>Max Modulation Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getMaxValveCurrent <em>Max Valve Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getPPccControl <em>PPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getQPccControl <em>QPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getQShare <em>QShare</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getTargetQpcc <em>Target Qpcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getTargetUpcc <em>Target Upcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getUv <em>Uv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsConverterImpl#getCapabilityCurve <em>Capability Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VsConverterImpl extends ACDCConverterImpl implements VsConverter {
    /**
     * The default value of the '{@link #getDelta() <em>Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelta()
     * @generated
     * @ordered
     */
    protected static final Float DELTA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDelta() <em>Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelta()
     * @generated
     * @ordered
     */
    protected Float delta = DELTA_EDEFAULT;

    /**
     * This is true if the Delta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deltaESet;

    /**
     * The default value of the '{@link #getDroop() <em>Droop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDroop()
     * @generated
     * @ordered
     */
    protected static final Float DROOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDroop() <em>Droop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDroop()
     * @generated
     * @ordered
     */
    protected Float droop = DROOP_EDEFAULT;

    /**
     * This is true if the Droop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean droopESet;

    /**
     * The default value of the '{@link #getDroopCompensation() <em>Droop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDroopCompensation()
     * @generated
     * @ordered
     */
    protected static final Float DROOP_COMPENSATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDroopCompensation() <em>Droop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDroopCompensation()
     * @generated
     * @ordered
     */
    protected Float droopCompensation = DROOP_COMPENSATION_EDEFAULT;

    /**
     * This is true if the Droop Compensation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean droopCompensationESet;

    /**
     * The default value of the '{@link #getMaxModulationIndex() <em>Max Modulation Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxModulationIndex()
     * @generated
     * @ordered
     */
    protected static final Float MAX_MODULATION_INDEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxModulationIndex() <em>Max Modulation Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxModulationIndex()
     * @generated
     * @ordered
     */
    protected Float maxModulationIndex = MAX_MODULATION_INDEX_EDEFAULT;

    /**
     * This is true if the Max Modulation Index attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxModulationIndexESet;

    /**
     * The default value of the '{@link #getMaxValveCurrent() <em>Max Valve Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValveCurrent()
     * @generated
     * @ordered
     */
    protected static final Float MAX_VALVE_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxValveCurrent() <em>Max Valve Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValveCurrent()
     * @generated
     * @ordered
     */
    protected Float maxValveCurrent = MAX_VALVE_CURRENT_EDEFAULT;

    /**
     * This is true if the Max Valve Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxValveCurrentESet;

    /**
     * The default value of the '{@link #getPPccControl() <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPPccControl()
     * @generated
     * @ordered
     */
    protected static final VsPpccControlKind PPCC_CONTROL_EDEFAULT = VsPpccControlKind.PPCC;

    /**
     * The cached value of the '{@link #getPPccControl() <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPPccControl()
     * @generated
     * @ordered
     */
    protected VsPpccControlKind pPccControl = PPCC_CONTROL_EDEFAULT;

    /**
     * This is true if the PPcc Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pPccControlESet;

    /**
     * The default value of the '{@link #getQPccControl() <em>QPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQPccControl()
     * @generated
     * @ordered
     */
    protected static final VsQpccControlKind QPCC_CONTROL_EDEFAULT = VsQpccControlKind.REACTIVE_PCC;

    /**
     * The cached value of the '{@link #getQPccControl() <em>QPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQPccControl()
     * @generated
     * @ordered
     */
    protected VsQpccControlKind qPccControl = QPCC_CONTROL_EDEFAULT;

    /**
     * This is true if the QPcc Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qPccControlESet;

    /**
     * The default value of the '{@link #getQShare() <em>QShare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQShare()
     * @generated
     * @ordered
     */
    protected static final Float QSHARE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQShare() <em>QShare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQShare()
     * @generated
     * @ordered
     */
    protected Float qShare = QSHARE_EDEFAULT;

    /**
     * This is true if the QShare attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qShareESet;

    /**
     * The default value of the '{@link #getTargetQpcc() <em>Target Qpcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetQpcc()
     * @generated
     * @ordered
     */
    protected static final Float TARGET_QPCC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetQpcc() <em>Target Qpcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetQpcc()
     * @generated
     * @ordered
     */
    protected Float targetQpcc = TARGET_QPCC_EDEFAULT;

    /**
     * This is true if the Target Qpcc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetQpccESet;

    /**
     * The default value of the '{@link #getTargetUpcc() <em>Target Upcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetUpcc()
     * @generated
     * @ordered
     */
    protected static final Float TARGET_UPCC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetUpcc() <em>Target Upcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetUpcc()
     * @generated
     * @ordered
     */
    protected Float targetUpcc = TARGET_UPCC_EDEFAULT;

    /**
     * This is true if the Target Upcc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetUpccESet;

    /**
     * The default value of the '{@link #getUv() <em>Uv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUv()
     * @generated
     * @ordered
     */
    protected static final Float UV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUv() <em>Uv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUv()
     * @generated
     * @ordered
     */
    protected Float uv = UV_EDEFAULT;

    /**
     * This is true if the Uv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uvESet;

    /**
     * The cached value of the '{@link #getCapabilityCurve() <em>Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityCurve()
     * @generated
     * @ordered
     */
    protected VsCapabilityCurve capabilityCurve;

    /**
     * This is true if the Capability Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityCurveESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VsConverterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVsConverter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDelta() {
        return delta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDelta( Float newDelta ) {
        Float oldDelta = delta;
        delta = newDelta;
        boolean oldDeltaESet = deltaESet;
        deltaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VS_CONVERTER__DELTA, oldDelta, delta, !oldDeltaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDelta() {
        Float oldDelta = delta;
        boolean oldDeltaESet = deltaESet;
        delta = DELTA_EDEFAULT;
        deltaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VS_CONVERTER__DELTA, oldDelta, DELTA_EDEFAULT, oldDeltaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDelta() {
        return deltaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDroop() {
        return droop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDroop( Float newDroop ) {
        Float oldDroop = droop;
        droop = newDroop;
        boolean oldDroopESet = droopESet;
        droopESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VS_CONVERTER__DROOP, oldDroop, droop, !oldDroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDroop() {
        Float oldDroop = droop;
        boolean oldDroopESet = droopESet;
        droop = DROOP_EDEFAULT;
        droopESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VS_CONVERTER__DROOP, oldDroop, DROOP_EDEFAULT, oldDroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDroop() {
        return droopESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDroopCompensation() {
        return droopCompensation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDroopCompensation( Float newDroopCompensation ) {
        Float oldDroopCompensation = droopCompensation;
        droopCompensation = newDroopCompensation;
        boolean oldDroopCompensationESet = droopCompensationESet;
        droopCompensationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__DROOP_COMPENSATION,
                    oldDroopCompensation, droopCompensation, !oldDroopCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDroopCompensation() {
        Float oldDroopCompensation = droopCompensation;
        boolean oldDroopCompensationESet = droopCompensationESet;
        droopCompensation = DROOP_COMPENSATION_EDEFAULT;
        droopCompensationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__DROOP_COMPENSATION,
                    oldDroopCompensation, DROOP_COMPENSATION_EDEFAULT, oldDroopCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDroopCompensation() {
        return droopCompensationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxModulationIndex() {
        return maxModulationIndex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxModulationIndex( Float newMaxModulationIndex ) {
        Float oldMaxModulationIndex = maxModulationIndex;
        maxModulationIndex = newMaxModulationIndex;
        boolean oldMaxModulationIndexESet = maxModulationIndexESet;
        maxModulationIndexESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX,
                    oldMaxModulationIndex, maxModulationIndex, !oldMaxModulationIndexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxModulationIndex() {
        Float oldMaxModulationIndex = maxModulationIndex;
        boolean oldMaxModulationIndexESet = maxModulationIndexESet;
        maxModulationIndex = MAX_MODULATION_INDEX_EDEFAULT;
        maxModulationIndexESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX,
                    oldMaxModulationIndex, MAX_MODULATION_INDEX_EDEFAULT, oldMaxModulationIndexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxModulationIndex() {
        return maxModulationIndexESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxValveCurrent() {
        return maxValveCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxValveCurrent( Float newMaxValveCurrent ) {
        Float oldMaxValveCurrent = maxValveCurrent;
        maxValveCurrent = newMaxValveCurrent;
        boolean oldMaxValveCurrentESet = maxValveCurrentESet;
        maxValveCurrentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__MAX_VALVE_CURRENT,
                    oldMaxValveCurrent, maxValveCurrent, !oldMaxValveCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxValveCurrent() {
        Float oldMaxValveCurrent = maxValveCurrent;
        boolean oldMaxValveCurrentESet = maxValveCurrentESet;
        maxValveCurrent = MAX_VALVE_CURRENT_EDEFAULT;
        maxValveCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__MAX_VALVE_CURRENT,
                    oldMaxValveCurrent, MAX_VALVE_CURRENT_EDEFAULT, oldMaxValveCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxValveCurrent() {
        return maxValveCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsPpccControlKind getPPccControl() {
        return pPccControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPPccControl( VsPpccControlKind newPPccControl ) {
        VsPpccControlKind oldPPccControl = pPccControl;
        pPccControl = newPPccControl == null ? PPCC_CONTROL_EDEFAULT : newPPccControl;
        boolean oldPPccControlESet = pPccControlESet;
        pPccControlESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VS_CONVERTER__PPCC_CONTROL, oldPPccControl, pPccControl, !oldPPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPPccControl() {
        VsPpccControlKind oldPPccControl = pPccControl;
        boolean oldPPccControlESet = pPccControlESet;
        pPccControl = PPCC_CONTROL_EDEFAULT;
        pPccControlESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VS_CONVERTER__PPCC_CONTROL, oldPPccControl, PPCC_CONTROL_EDEFAULT, oldPPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPPccControl() {
        return pPccControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsQpccControlKind getQPccControl() {
        return qPccControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQPccControl( VsQpccControlKind newQPccControl ) {
        VsQpccControlKind oldQPccControl = qPccControl;
        qPccControl = newQPccControl == null ? QPCC_CONTROL_EDEFAULT : newQPccControl;
        boolean oldQPccControlESet = qPccControlESet;
        qPccControlESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VS_CONVERTER__QPCC_CONTROL, oldQPccControl, qPccControl, !oldQPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQPccControl() {
        VsQpccControlKind oldQPccControl = qPccControl;
        boolean oldQPccControlESet = qPccControlESet;
        qPccControl = QPCC_CONTROL_EDEFAULT;
        qPccControlESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VS_CONVERTER__QPCC_CONTROL, oldQPccControl, QPCC_CONTROL_EDEFAULT, oldQPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQPccControl() {
        return qPccControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQShare() {
        return qShare;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQShare( Float newQShare ) {
        Float oldQShare = qShare;
        qShare = newQShare;
        boolean oldQShareESet = qShareESet;
        qShareESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VS_CONVERTER__QSHARE, oldQShare, qShare, !oldQShareESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQShare() {
        Float oldQShare = qShare;
        boolean oldQShareESet = qShareESet;
        qShare = QSHARE_EDEFAULT;
        qShareESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VS_CONVERTER__QSHARE, oldQShare, QSHARE_EDEFAULT, oldQShareESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQShare() {
        return qShareESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTargetQpcc() {
        return targetQpcc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetQpcc( Float newTargetQpcc ) {
        Float oldTargetQpcc = targetQpcc;
        targetQpcc = newTargetQpcc;
        boolean oldTargetQpccESet = targetQpccESet;
        targetQpccESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VS_CONVERTER__TARGET_QPCC, oldTargetQpcc, targetQpcc, !oldTargetQpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetQpcc() {
        Float oldTargetQpcc = targetQpcc;
        boolean oldTargetQpccESet = targetQpccESet;
        targetQpcc = TARGET_QPCC_EDEFAULT;
        targetQpccESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VS_CONVERTER__TARGET_QPCC, oldTargetQpcc, TARGET_QPCC_EDEFAULT, oldTargetQpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetQpcc() {
        return targetQpccESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTargetUpcc() {
        return targetUpcc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetUpcc( Float newTargetUpcc ) {
        Float oldTargetUpcc = targetUpcc;
        targetUpcc = newTargetUpcc;
        boolean oldTargetUpccESet = targetUpccESet;
        targetUpccESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VS_CONVERTER__TARGET_UPCC, oldTargetUpcc, targetUpcc, !oldTargetUpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetUpcc() {
        Float oldTargetUpcc = targetUpcc;
        boolean oldTargetUpccESet = targetUpccESet;
        targetUpcc = TARGET_UPCC_EDEFAULT;
        targetUpccESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VS_CONVERTER__TARGET_UPCC, oldTargetUpcc, TARGET_UPCC_EDEFAULT, oldTargetUpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetUpcc() {
        return targetUpccESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUv() {
        return uv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUv( Float newUv ) {
        Float oldUv = uv;
        uv = newUv;
        boolean oldUvESet = uvESet;
        uvESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__UV, oldUv, uv, !oldUvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUv() {
        Float oldUv = uv;
        boolean oldUvESet = uvESet;
        uv = UV_EDEFAULT;
        uvESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VS_CONVERTER__UV, oldUv, UV_EDEFAULT, oldUvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUv() {
        return uvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsCapabilityCurve getCapabilityCurve() {
        return capabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCapabilityCurve( VsCapabilityCurve newCapabilityCurve, NotificationChain msgs ) {
        VsCapabilityCurve oldCapabilityCurve = capabilityCurve;
        capabilityCurve = newCapabilityCurve;
        boolean oldCapabilityCurveESet = capabilityCurveESet;
        capabilityCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VS_CONVERTER__CAPABILITY_CURVE, oldCapabilityCurve, newCapabilityCurve,
                    !oldCapabilityCurveESet );
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
    public void setCapabilityCurve( VsCapabilityCurve newCapabilityCurve ) {
        if( newCapabilityCurve != capabilityCurve ) {
            NotificationChain msgs = null;
            if( capabilityCurve != null ) msgs = ( ( InternalEObject ) capabilityCurve ).eInverseRemove( this,
                    CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES, VsCapabilityCurve.class, msgs );
            if( newCapabilityCurve != null ) msgs = ( ( InternalEObject ) newCapabilityCurve ).eInverseAdd( this,
                    CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES, VsCapabilityCurve.class, msgs );
            msgs = basicSetCapabilityCurve( newCapabilityCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCapabilityCurveESet = capabilityCurveESet;
            capabilityCurveESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__CAPABILITY_CURVE,
                        newCapabilityCurve, newCapabilityCurve, !oldCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCapabilityCurve( NotificationChain msgs ) {
        VsCapabilityCurve oldCapabilityCurve = capabilityCurve;
        capabilityCurve = null;
        boolean oldCapabilityCurveESet = capabilityCurveESet;
        capabilityCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VS_CONVERTER__CAPABILITY_CURVE, oldCapabilityCurve, null, oldCapabilityCurveESet );
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
    public void unsetCapabilityCurve() {
        if( capabilityCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) capabilityCurve ).eInverseRemove( this,
                    CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES, VsCapabilityCurve.class, msgs );
            msgs = basicUnsetCapabilityCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCapabilityCurveESet = capabilityCurveESet;
            capabilityCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VS_CONVERTER__CAPABILITY_CURVE, null, null, oldCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilityCurve() {
        return capabilityCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            if( capabilityCurve != null ) msgs = ( ( InternalEObject ) capabilityCurve ).eInverseRemove( this,
                    CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES, VsCapabilityCurve.class, msgs );
            return basicSetCapabilityCurve( ( VsCapabilityCurve ) otherEnd, msgs );
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
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            return basicUnsetCapabilityCurve( msgs );
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
        case CimPackage.VS_CONVERTER__DELTA:
            return getDelta();
        case CimPackage.VS_CONVERTER__DROOP:
            return getDroop();
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
            return getDroopCompensation();
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
            return getMaxModulationIndex();
        case CimPackage.VS_CONVERTER__MAX_VALVE_CURRENT:
            return getMaxValveCurrent();
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
            return getPPccControl();
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
            return getQPccControl();
        case CimPackage.VS_CONVERTER__QSHARE:
            return getQShare();
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
            return getTargetQpcc();
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
            return getTargetUpcc();
        case CimPackage.VS_CONVERTER__UV:
            return getUv();
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            return getCapabilityCurve();
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
        case CimPackage.VS_CONVERTER__DELTA:
            setDelta( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__DROOP:
            setDroop( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
            setDroopCompensation( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
            setMaxModulationIndex( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__MAX_VALVE_CURRENT:
            setMaxValveCurrent( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
            setPPccControl( ( VsPpccControlKind ) newValue );
            return;
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
            setQPccControl( ( VsQpccControlKind ) newValue );
            return;
        case CimPackage.VS_CONVERTER__QSHARE:
            setQShare( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
            setTargetQpcc( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
            setTargetUpcc( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__UV:
            setUv( ( Float ) newValue );
            return;
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            setCapabilityCurve( ( VsCapabilityCurve ) newValue );
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
        case CimPackage.VS_CONVERTER__DELTA:
            unsetDelta();
            return;
        case CimPackage.VS_CONVERTER__DROOP:
            unsetDroop();
            return;
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
            unsetDroopCompensation();
            return;
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
            unsetMaxModulationIndex();
            return;
        case CimPackage.VS_CONVERTER__MAX_VALVE_CURRENT:
            unsetMaxValveCurrent();
            return;
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
            unsetPPccControl();
            return;
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
            unsetQPccControl();
            return;
        case CimPackage.VS_CONVERTER__QSHARE:
            unsetQShare();
            return;
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
            unsetTargetQpcc();
            return;
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
            unsetTargetUpcc();
            return;
        case CimPackage.VS_CONVERTER__UV:
            unsetUv();
            return;
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            unsetCapabilityCurve();
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
        case CimPackage.VS_CONVERTER__DELTA:
            return isSetDelta();
        case CimPackage.VS_CONVERTER__DROOP:
            return isSetDroop();
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
            return isSetDroopCompensation();
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
            return isSetMaxModulationIndex();
        case CimPackage.VS_CONVERTER__MAX_VALVE_CURRENT:
            return isSetMaxValveCurrent();
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
            return isSetPPccControl();
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
            return isSetQPccControl();
        case CimPackage.VS_CONVERTER__QSHARE:
            return isSetQShare();
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
            return isSetTargetQpcc();
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
            return isSetTargetUpcc();
        case CimPackage.VS_CONVERTER__UV:
            return isSetUv();
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            return isSetCapabilityCurve();
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
        result.append( " (delta: " );
        if( deltaESet )
            result.append( delta );
        else
            result.append( "<unset>" );
        result.append( ", droop: " );
        if( droopESet )
            result.append( droop );
        else
            result.append( "<unset>" );
        result.append( ", droopCompensation: " );
        if( droopCompensationESet )
            result.append( droopCompensation );
        else
            result.append( "<unset>" );
        result.append( ", maxModulationIndex: " );
        if( maxModulationIndexESet )
            result.append( maxModulationIndex );
        else
            result.append( "<unset>" );
        result.append( ", maxValveCurrent: " );
        if( maxValveCurrentESet )
            result.append( maxValveCurrent );
        else
            result.append( "<unset>" );
        result.append( ", pPccControl: " );
        if( pPccControlESet )
            result.append( pPccControl );
        else
            result.append( "<unset>" );
        result.append( ", qPccControl: " );
        if( qPccControlESet )
            result.append( qPccControl );
        else
            result.append( "<unset>" );
        result.append( ", qShare: " );
        if( qShareESet )
            result.append( qShare );
        else
            result.append( "<unset>" );
        result.append( ", targetQpcc: " );
        if( targetQpccESet )
            result.append( targetQpcc );
        else
            result.append( "<unset>" );
        result.append( ", targetUpcc: " );
        if( targetUpccESet )
            result.append( targetUpcc );
        else
            result.append( "<unset>" );
        result.append( ", uv: " );
        if( uvESet )
            result.append( uv );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VsConverterImpl
