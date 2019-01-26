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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverterDCTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;

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
 * An implementation of the model object '<em><b>ACDC Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getBaseS <em>Base S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getIdc <em>Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getIdleLoss <em>Idle Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getMaxUdc <em>Max Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getMinUdc <em>Min Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getNumberOfValves <em>Number Of Valves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getPoleLossP <em>Pole Loss P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getRatedUdc <em>Rated Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getResistiveLoss <em>Resistive Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getSwitchingLoss <em>Switching Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getTargetPpcc <em>Target Ppcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getTargetUdc <em>Target Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getUc <em>Uc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getUdc <em>Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getValveU0 <em>Valve U0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getDCTerminals <em>DC Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterImpl#getPccTerminal <em>Pcc Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACDCConverterImpl extends ConductingEquipmentImpl implements ACDCConverter {
    /**
     * The default value of the '{@link #getBaseS() <em>Base S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseS()
     * @generated
     * @ordered
     */
    protected static final Float BASE_S_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaseS() <em>Base S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseS()
     * @generated
     * @ordered
     */
    protected Float baseS = BASE_S_EDEFAULT;

    /**
     * This is true if the Base S attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseSESet;

    /**
     * The default value of the '{@link #getIdc() <em>Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdc()
     * @generated
     * @ordered
     */
    protected static final Float IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdc() <em>Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdc()
     * @generated
     * @ordered
     */
    protected Float idc = IDC_EDEFAULT;

    /**
     * This is true if the Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idcESet;

    /**
     * The default value of the '{@link #getIdleLoss() <em>Idle Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdleLoss()
     * @generated
     * @ordered
     */
    protected static final Float IDLE_LOSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdleLoss() <em>Idle Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdleLoss()
     * @generated
     * @ordered
     */
    protected Float idleLoss = IDLE_LOSS_EDEFAULT;

    /**
     * This is true if the Idle Loss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idleLossESet;

    /**
     * The default value of the '{@link #getMaxUdc() <em>Max Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxUdc()
     * @generated
     * @ordered
     */
    protected static final Float MAX_UDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxUdc() <em>Max Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxUdc()
     * @generated
     * @ordered
     */
    protected Float maxUdc = MAX_UDC_EDEFAULT;

    /**
     * This is true if the Max Udc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxUdcESet;

    /**
     * The default value of the '{@link #getMinUdc() <em>Min Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinUdc()
     * @generated
     * @ordered
     */
    protected static final Float MIN_UDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinUdc() <em>Min Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinUdc()
     * @generated
     * @ordered
     */
    protected Float minUdc = MIN_UDC_EDEFAULT;

    /**
     * This is true if the Min Udc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minUdcESet;

    /**
     * The default value of the '{@link #getNumberOfValves() <em>Number Of Valves</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfValves()
     * @generated
     * @ordered
     */
    protected static final Integer NUMBER_OF_VALVES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNumberOfValves() <em>Number Of Valves</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfValves()
     * @generated
     * @ordered
     */
    protected Integer numberOfValves = NUMBER_OF_VALVES_EDEFAULT;

    /**
     * This is true if the Number Of Valves attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean numberOfValvesESet;

    /**
     * The default value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected static final Float P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected Float p = P_EDEFAULT;

    /**
     * This is true if the P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pESet;

    /**
     * The default value of the '{@link #getPoleLossP() <em>Pole Loss P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoleLossP()
     * @generated
     * @ordered
     */
    protected static final Float POLE_LOSS_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPoleLossP() <em>Pole Loss P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoleLossP()
     * @generated
     * @ordered
     */
    protected Float poleLossP = POLE_LOSS_P_EDEFAULT;

    /**
     * This is true if the Pole Loss P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean poleLossPESet;

    /**
     * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected static final Float Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected Float q = Q_EDEFAULT;

    /**
     * This is true if the Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qESet;

    /**
     * The default value of the '{@link #getRatedUdc() <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedUdc()
     * @generated
     * @ordered
     */
    protected static final Float RATED_UDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedUdc() <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedUdc()
     * @generated
     * @ordered
     */
    protected Float ratedUdc = RATED_UDC_EDEFAULT;

    /**
     * This is true if the Rated Udc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedUdcESet;

    /**
     * The default value of the '{@link #getResistiveLoss() <em>Resistive Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistiveLoss()
     * @generated
     * @ordered
     */
    protected static final Float RESISTIVE_LOSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResistiveLoss() <em>Resistive Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistiveLoss()
     * @generated
     * @ordered
     */
    protected Float resistiveLoss = RESISTIVE_LOSS_EDEFAULT;

    /**
     * This is true if the Resistive Loss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resistiveLossESet;

    /**
     * The default value of the '{@link #getSwitchingLoss() <em>Switching Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingLoss()
     * @generated
     * @ordered
     */
    protected static final Float SWITCHING_LOSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSwitchingLoss() <em>Switching Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingLoss()
     * @generated
     * @ordered
     */
    protected Float switchingLoss = SWITCHING_LOSS_EDEFAULT;

    /**
     * This is true if the Switching Loss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchingLossESet;

    /**
     * The default value of the '{@link #getTargetPpcc() <em>Target Ppcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPpcc()
     * @generated
     * @ordered
     */
    protected static final Float TARGET_PPCC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetPpcc() <em>Target Ppcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPpcc()
     * @generated
     * @ordered
     */
    protected Float targetPpcc = TARGET_PPCC_EDEFAULT;

    /**
     * This is true if the Target Ppcc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetPpccESet;

    /**
     * The default value of the '{@link #getTargetUdc() <em>Target Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetUdc()
     * @generated
     * @ordered
     */
    protected static final Float TARGET_UDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetUdc() <em>Target Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetUdc()
     * @generated
     * @ordered
     */
    protected Float targetUdc = TARGET_UDC_EDEFAULT;

    /**
     * This is true if the Target Udc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetUdcESet;

    /**
     * The default value of the '{@link #getUc() <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUc()
     * @generated
     * @ordered
     */
    protected static final Float UC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUc() <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUc()
     * @generated
     * @ordered
     */
    protected Float uc = UC_EDEFAULT;

    /**
     * This is true if the Uc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ucESet;

    /**
     * The default value of the '{@link #getUdc() <em>Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdc()
     * @generated
     * @ordered
     */
    protected static final Float UDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUdc() <em>Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdc()
     * @generated
     * @ordered
     */
    protected Float udc = UDC_EDEFAULT;

    /**
     * This is true if the Udc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean udcESet;

    /**
     * The default value of the '{@link #getValveU0() <em>Valve U0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValveU0()
     * @generated
     * @ordered
     */
    protected static final Float VALVE_U0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValveU0() <em>Valve U0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValveU0()
     * @generated
     * @ordered
     */
    protected Float valveU0 = VALVE_U0_EDEFAULT;

    /**
     * This is true if the Valve U0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valveU0ESet;

    /**
     * The cached value of the '{@link #getDCTerminals() <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCTerminals()
     * @generated
     * @ordered
     */
    protected EList< ACDCConverterDCTerminal > dcTerminals;

    /**
     * The cached value of the '{@link #getPccTerminal() <em>Pcc Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPccTerminal()
     * @generated
     * @ordered
     */
    protected Terminal pccTerminal;

    /**
     * This is true if the Pcc Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pccTerminalESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ACDCConverterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getACDCConverter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBaseS() {
        return baseS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseS( Float newBaseS ) {
        Float oldBaseS = baseS;
        baseS = newBaseS;
        boolean oldBaseSESet = baseSESet;
        baseSESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__BASE_S, oldBaseS, baseS, !oldBaseSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBaseS() {
        Float oldBaseS = baseS;
        boolean oldBaseSESet = baseSESet;
        baseS = BASE_S_EDEFAULT;
        baseSESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__BASE_S, oldBaseS, BASE_S_EDEFAULT, oldBaseSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseS() {
        return baseSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIdc() {
        return idc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdc( Float newIdc ) {
        Float oldIdc = idc;
        idc = newIdc;
        boolean oldIdcESet = idcESet;
        idcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__IDC, oldIdc, idc, !oldIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIdc() {
        Float oldIdc = idc;
        boolean oldIdcESet = idcESet;
        idc = IDC_EDEFAULT;
        idcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__IDC, oldIdc, IDC_EDEFAULT, oldIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIdc() {
        return idcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIdleLoss() {
        return idleLoss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdleLoss( Float newIdleLoss ) {
        Float oldIdleLoss = idleLoss;
        idleLoss = newIdleLoss;
        boolean oldIdleLossESet = idleLossESet;
        idleLossESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__IDLE_LOSS, oldIdleLoss, idleLoss, !oldIdleLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIdleLoss() {
        Float oldIdleLoss = idleLoss;
        boolean oldIdleLossESet = idleLossESet;
        idleLoss = IDLE_LOSS_EDEFAULT;
        idleLossESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__IDLE_LOSS, oldIdleLoss, IDLE_LOSS_EDEFAULT, oldIdleLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIdleLoss() {
        return idleLossESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxUdc() {
        return maxUdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxUdc( Float newMaxUdc ) {
        Float oldMaxUdc = maxUdc;
        maxUdc = newMaxUdc;
        boolean oldMaxUdcESet = maxUdcESet;
        maxUdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__MAX_UDC, oldMaxUdc, maxUdc, !oldMaxUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxUdc() {
        Float oldMaxUdc = maxUdc;
        boolean oldMaxUdcESet = maxUdcESet;
        maxUdc = MAX_UDC_EDEFAULT;
        maxUdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__MAX_UDC, oldMaxUdc, MAX_UDC_EDEFAULT, oldMaxUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxUdc() {
        return maxUdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinUdc() {
        return minUdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinUdc( Float newMinUdc ) {
        Float oldMinUdc = minUdc;
        minUdc = newMinUdc;
        boolean oldMinUdcESet = minUdcESet;
        minUdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__MIN_UDC, oldMinUdc, minUdc, !oldMinUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinUdc() {
        Float oldMinUdc = minUdc;
        boolean oldMinUdcESet = minUdcESet;
        minUdc = MIN_UDC_EDEFAULT;
        minUdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__MIN_UDC, oldMinUdc, MIN_UDC_EDEFAULT, oldMinUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinUdc() {
        return minUdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNumberOfValves() {
        return numberOfValves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumberOfValves( Integer newNumberOfValves ) {
        Integer oldNumberOfValves = numberOfValves;
        numberOfValves = newNumberOfValves;
        boolean oldNumberOfValvesESet = numberOfValvesESet;
        numberOfValvesESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACDC_CONVERTER__NUMBER_OF_VALVES,
                    oldNumberOfValves, numberOfValves, !oldNumberOfValvesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNumberOfValves() {
        Integer oldNumberOfValves = numberOfValves;
        boolean oldNumberOfValvesESet = numberOfValvesESet;
        numberOfValves = NUMBER_OF_VALVES_EDEFAULT;
        numberOfValvesESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACDC_CONVERTER__NUMBER_OF_VALVES,
                    oldNumberOfValves, NUMBER_OF_VALVES_EDEFAULT, oldNumberOfValvesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNumberOfValves() {
        return numberOfValvesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP() {
        return p;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP( Float newP ) {
        Float oldP = p;
        p = newP;
        boolean oldPESet = pESet;
        pESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ACDC_CONVERTER__P, oldP, p, !oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP() {
        Float oldP = p;
        boolean oldPESet = pESet;
        p = P_EDEFAULT;
        pESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__P, oldP, P_EDEFAULT, oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP() {
        return pESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPoleLossP() {
        return poleLossP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPoleLossP( Float newPoleLossP ) {
        Float oldPoleLossP = poleLossP;
        poleLossP = newPoleLossP;
        boolean oldPoleLossPESet = poleLossPESet;
        poleLossPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__POLE_LOSS_P, oldPoleLossP, poleLossP, !oldPoleLossPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPoleLossP() {
        Float oldPoleLossP = poleLossP;
        boolean oldPoleLossPESet = poleLossPESet;
        poleLossP = POLE_LOSS_P_EDEFAULT;
        poleLossPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__POLE_LOSS_P, oldPoleLossP, POLE_LOSS_P_EDEFAULT, oldPoleLossPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPoleLossP() {
        return poleLossPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ() {
        return q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ( Float newQ ) {
        Float oldQ = q;
        q = newQ;
        boolean oldQESet = qESet;
        qESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ACDC_CONVERTER__Q, oldQ, q, !oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ() {
        Float oldQ = q;
        boolean oldQESet = qESet;
        q = Q_EDEFAULT;
        qESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__Q, oldQ, Q_EDEFAULT, oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ() {
        return qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedUdc() {
        return ratedUdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedUdc( Float newRatedUdc ) {
        Float oldRatedUdc = ratedUdc;
        ratedUdc = newRatedUdc;
        boolean oldRatedUdcESet = ratedUdcESet;
        ratedUdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__RATED_UDC, oldRatedUdc, ratedUdc, !oldRatedUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedUdc() {
        Float oldRatedUdc = ratedUdc;
        boolean oldRatedUdcESet = ratedUdcESet;
        ratedUdc = RATED_UDC_EDEFAULT;
        ratedUdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__RATED_UDC, oldRatedUdc, RATED_UDC_EDEFAULT, oldRatedUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedUdc() {
        return ratedUdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getResistiveLoss() {
        return resistiveLoss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResistiveLoss( Float newResistiveLoss ) {
        Float oldResistiveLoss = resistiveLoss;
        resistiveLoss = newResistiveLoss;
        boolean oldResistiveLossESet = resistiveLossESet;
        resistiveLossESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__RESISTIVE_LOSS, oldResistiveLoss, resistiveLoss, !oldResistiveLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResistiveLoss() {
        Float oldResistiveLoss = resistiveLoss;
        boolean oldResistiveLossESet = resistiveLossESet;
        resistiveLoss = RESISTIVE_LOSS_EDEFAULT;
        resistiveLossESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACDC_CONVERTER__RESISTIVE_LOSS,
                    oldResistiveLoss, RESISTIVE_LOSS_EDEFAULT, oldResistiveLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResistiveLoss() {
        return resistiveLossESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSwitchingLoss() {
        return switchingLoss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSwitchingLoss( Float newSwitchingLoss ) {
        Float oldSwitchingLoss = switchingLoss;
        switchingLoss = newSwitchingLoss;
        boolean oldSwitchingLossESet = switchingLossESet;
        switchingLossESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__SWITCHING_LOSS, oldSwitchingLoss, switchingLoss, !oldSwitchingLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchingLoss() {
        Float oldSwitchingLoss = switchingLoss;
        boolean oldSwitchingLossESet = switchingLossESet;
        switchingLoss = SWITCHING_LOSS_EDEFAULT;
        switchingLossESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACDC_CONVERTER__SWITCHING_LOSS,
                    oldSwitchingLoss, SWITCHING_LOSS_EDEFAULT, oldSwitchingLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingLoss() {
        return switchingLossESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTargetPpcc() {
        return targetPpcc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetPpcc( Float newTargetPpcc ) {
        Float oldTargetPpcc = targetPpcc;
        targetPpcc = newTargetPpcc;
        boolean oldTargetPpccESet = targetPpccESet;
        targetPpccESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__TARGET_PPCC, oldTargetPpcc, targetPpcc, !oldTargetPpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetPpcc() {
        Float oldTargetPpcc = targetPpcc;
        boolean oldTargetPpccESet = targetPpccESet;
        targetPpcc = TARGET_PPCC_EDEFAULT;
        targetPpccESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__TARGET_PPCC, oldTargetPpcc, TARGET_PPCC_EDEFAULT, oldTargetPpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetPpcc() {
        return targetPpccESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTargetUdc() {
        return targetUdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetUdc( Float newTargetUdc ) {
        Float oldTargetUdc = targetUdc;
        targetUdc = newTargetUdc;
        boolean oldTargetUdcESet = targetUdcESet;
        targetUdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__TARGET_UDC, oldTargetUdc, targetUdc, !oldTargetUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetUdc() {
        Float oldTargetUdc = targetUdc;
        boolean oldTargetUdcESet = targetUdcESet;
        targetUdc = TARGET_UDC_EDEFAULT;
        targetUdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__TARGET_UDC, oldTargetUdc, TARGET_UDC_EDEFAULT, oldTargetUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetUdc() {
        return targetUdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUc() {
        return uc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUc( Float newUc ) {
        Float oldUc = uc;
        uc = newUc;
        boolean oldUcESet = ucESet;
        ucESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ACDC_CONVERTER__UC, oldUc, uc, !oldUcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUc() {
        Float oldUc = uc;
        boolean oldUcESet = ucESet;
        uc = UC_EDEFAULT;
        ucESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__UC, oldUc, UC_EDEFAULT, oldUcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUc() {
        return ucESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUdc() {
        return udc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUdc( Float newUdc ) {
        Float oldUdc = udc;
        udc = newUdc;
        boolean oldUdcESet = udcESet;
        udcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__UDC, oldUdc, udc, !oldUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUdc() {
        Float oldUdc = udc;
        boolean oldUdcESet = udcESet;
        udc = UDC_EDEFAULT;
        udcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__UDC, oldUdc, UDC_EDEFAULT, oldUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUdc() {
        return udcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getValveU0() {
        return valveU0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValveU0( Float newValveU0 ) {
        Float oldValveU0 = valveU0;
        valveU0 = newValveU0;
        boolean oldValveU0ESet = valveU0ESet;
        valveU0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER__VALVE_U0, oldValveU0, valveU0, !oldValveU0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValveU0() {
        Float oldValveU0 = valveU0;
        boolean oldValveU0ESet = valveU0ESet;
        valveU0 = VALVE_U0_EDEFAULT;
        valveU0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER__VALVE_U0, oldValveU0, VALVE_U0_EDEFAULT, oldValveU0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValveU0() {
        return valveU0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ACDCConverterDCTerminal > getDCTerminals() {
        if( dcTerminals == null ) {
            dcTerminals = new EObjectWithInverseResolvingEList.Unsettable< ACDCConverterDCTerminal >(
                    ACDCConverterDCTerminal.class, this, CimPackage.ACDC_CONVERTER__DC_TERMINALS,
                    CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT );
        }
        return dcTerminals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCTerminals() {
        if( dcTerminals != null ) ( ( InternalEList.Unsettable< ? > ) dcTerminals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCTerminals() {
        return dcTerminals != null && ( ( InternalEList.Unsettable< ? > ) dcTerminals ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal getPccTerminal() {
        return pccTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPccTerminal( Terminal newPccTerminal, NotificationChain msgs ) {
        Terminal oldPccTerminal = pccTerminal;
        pccTerminal = newPccTerminal;
        boolean oldPccTerminalESet = pccTerminalESet;
        pccTerminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACDC_CONVERTER__PCC_TERMINAL, oldPccTerminal, newPccTerminal, !oldPccTerminalESet );
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
    public void setPccTerminal( Terminal newPccTerminal ) {
        if( newPccTerminal != pccTerminal ) {
            NotificationChain msgs = null;
            if( pccTerminal != null ) msgs = ( ( InternalEObject ) pccTerminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__CONVERTER_DC_SIDES, Terminal.class, msgs );
            if( newPccTerminal != null ) msgs = ( ( InternalEObject ) newPccTerminal ).eInverseAdd( this,
                    CimPackage.TERMINAL__CONVERTER_DC_SIDES, Terminal.class, msgs );
            msgs = basicSetPccTerminal( newPccTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPccTerminalESet = pccTerminalESet;
            pccTerminalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACDC_CONVERTER__PCC_TERMINAL, newPccTerminal, newPccTerminal, !oldPccTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPccTerminal( NotificationChain msgs ) {
        Terminal oldPccTerminal = pccTerminal;
        pccTerminal = null;
        boolean oldPccTerminalESet = pccTerminalESet;
        pccTerminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACDC_CONVERTER__PCC_TERMINAL, oldPccTerminal, null, oldPccTerminalESet );
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
    public void unsetPccTerminal() {
        if( pccTerminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pccTerminal ).eInverseRemove( this, CimPackage.TERMINAL__CONVERTER_DC_SIDES,
                    Terminal.class, msgs );
            msgs = basicUnsetPccTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPccTerminalESet = pccTerminalESet;
            pccTerminalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACDC_CONVERTER__PCC_TERMINAL, null, null, oldPccTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPccTerminal() {
        return pccTerminalESet;
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
        case CimPackage.ACDC_CONVERTER__DC_TERMINALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCTerminals() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ACDC_CONVERTER__PCC_TERMINAL:
            if( pccTerminal != null ) msgs = ( ( InternalEObject ) pccTerminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__CONVERTER_DC_SIDES, Terminal.class, msgs );
            return basicSetPccTerminal( ( Terminal ) otherEnd, msgs );
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
        case CimPackage.ACDC_CONVERTER__DC_TERMINALS:
            return ( ( InternalEList< ? > ) getDCTerminals() ).basicRemove( otherEnd, msgs );
        case CimPackage.ACDC_CONVERTER__PCC_TERMINAL:
            return basicUnsetPccTerminal( msgs );
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
        case CimPackage.ACDC_CONVERTER__BASE_S:
            return getBaseS();
        case CimPackage.ACDC_CONVERTER__IDC:
            return getIdc();
        case CimPackage.ACDC_CONVERTER__IDLE_LOSS:
            return getIdleLoss();
        case CimPackage.ACDC_CONVERTER__MAX_UDC:
            return getMaxUdc();
        case CimPackage.ACDC_CONVERTER__MIN_UDC:
            return getMinUdc();
        case CimPackage.ACDC_CONVERTER__NUMBER_OF_VALVES:
            return getNumberOfValves();
        case CimPackage.ACDC_CONVERTER__P:
            return getP();
        case CimPackage.ACDC_CONVERTER__POLE_LOSS_P:
            return getPoleLossP();
        case CimPackage.ACDC_CONVERTER__Q:
            return getQ();
        case CimPackage.ACDC_CONVERTER__RATED_UDC:
            return getRatedUdc();
        case CimPackage.ACDC_CONVERTER__RESISTIVE_LOSS:
            return getResistiveLoss();
        case CimPackage.ACDC_CONVERTER__SWITCHING_LOSS:
            return getSwitchingLoss();
        case CimPackage.ACDC_CONVERTER__TARGET_PPCC:
            return getTargetPpcc();
        case CimPackage.ACDC_CONVERTER__TARGET_UDC:
            return getTargetUdc();
        case CimPackage.ACDC_CONVERTER__UC:
            return getUc();
        case CimPackage.ACDC_CONVERTER__UDC:
            return getUdc();
        case CimPackage.ACDC_CONVERTER__VALVE_U0:
            return getValveU0();
        case CimPackage.ACDC_CONVERTER__DC_TERMINALS:
            return getDCTerminals();
        case CimPackage.ACDC_CONVERTER__PCC_TERMINAL:
            return getPccTerminal();
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
        case CimPackage.ACDC_CONVERTER__BASE_S:
            setBaseS( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__IDC:
            setIdc( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__IDLE_LOSS:
            setIdleLoss( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__MAX_UDC:
            setMaxUdc( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__MIN_UDC:
            setMinUdc( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__NUMBER_OF_VALVES:
            setNumberOfValves( ( Integer ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__P:
            setP( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__POLE_LOSS_P:
            setPoleLossP( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__RATED_UDC:
            setRatedUdc( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__RESISTIVE_LOSS:
            setResistiveLoss( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__SWITCHING_LOSS:
            setSwitchingLoss( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__TARGET_PPCC:
            setTargetPpcc( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__TARGET_UDC:
            setTargetUdc( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__UC:
            setUc( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__UDC:
            setUdc( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__VALVE_U0:
            setValveU0( ( Float ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__DC_TERMINALS:
            getDCTerminals().clear();
            getDCTerminals().addAll( ( Collection< ? extends ACDCConverterDCTerminal > ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER__PCC_TERMINAL:
            setPccTerminal( ( Terminal ) newValue );
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
        case CimPackage.ACDC_CONVERTER__BASE_S:
            unsetBaseS();
            return;
        case CimPackage.ACDC_CONVERTER__IDC:
            unsetIdc();
            return;
        case CimPackage.ACDC_CONVERTER__IDLE_LOSS:
            unsetIdleLoss();
            return;
        case CimPackage.ACDC_CONVERTER__MAX_UDC:
            unsetMaxUdc();
            return;
        case CimPackage.ACDC_CONVERTER__MIN_UDC:
            unsetMinUdc();
            return;
        case CimPackage.ACDC_CONVERTER__NUMBER_OF_VALVES:
            unsetNumberOfValves();
            return;
        case CimPackage.ACDC_CONVERTER__P:
            unsetP();
            return;
        case CimPackage.ACDC_CONVERTER__POLE_LOSS_P:
            unsetPoleLossP();
            return;
        case CimPackage.ACDC_CONVERTER__Q:
            unsetQ();
            return;
        case CimPackage.ACDC_CONVERTER__RATED_UDC:
            unsetRatedUdc();
            return;
        case CimPackage.ACDC_CONVERTER__RESISTIVE_LOSS:
            unsetResistiveLoss();
            return;
        case CimPackage.ACDC_CONVERTER__SWITCHING_LOSS:
            unsetSwitchingLoss();
            return;
        case CimPackage.ACDC_CONVERTER__TARGET_PPCC:
            unsetTargetPpcc();
            return;
        case CimPackage.ACDC_CONVERTER__TARGET_UDC:
            unsetTargetUdc();
            return;
        case CimPackage.ACDC_CONVERTER__UC:
            unsetUc();
            return;
        case CimPackage.ACDC_CONVERTER__UDC:
            unsetUdc();
            return;
        case CimPackage.ACDC_CONVERTER__VALVE_U0:
            unsetValveU0();
            return;
        case CimPackage.ACDC_CONVERTER__DC_TERMINALS:
            unsetDCTerminals();
            return;
        case CimPackage.ACDC_CONVERTER__PCC_TERMINAL:
            unsetPccTerminal();
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
        case CimPackage.ACDC_CONVERTER__BASE_S:
            return isSetBaseS();
        case CimPackage.ACDC_CONVERTER__IDC:
            return isSetIdc();
        case CimPackage.ACDC_CONVERTER__IDLE_LOSS:
            return isSetIdleLoss();
        case CimPackage.ACDC_CONVERTER__MAX_UDC:
            return isSetMaxUdc();
        case CimPackage.ACDC_CONVERTER__MIN_UDC:
            return isSetMinUdc();
        case CimPackage.ACDC_CONVERTER__NUMBER_OF_VALVES:
            return isSetNumberOfValves();
        case CimPackage.ACDC_CONVERTER__P:
            return isSetP();
        case CimPackage.ACDC_CONVERTER__POLE_LOSS_P:
            return isSetPoleLossP();
        case CimPackage.ACDC_CONVERTER__Q:
            return isSetQ();
        case CimPackage.ACDC_CONVERTER__RATED_UDC:
            return isSetRatedUdc();
        case CimPackage.ACDC_CONVERTER__RESISTIVE_LOSS:
            return isSetResistiveLoss();
        case CimPackage.ACDC_CONVERTER__SWITCHING_LOSS:
            return isSetSwitchingLoss();
        case CimPackage.ACDC_CONVERTER__TARGET_PPCC:
            return isSetTargetPpcc();
        case CimPackage.ACDC_CONVERTER__TARGET_UDC:
            return isSetTargetUdc();
        case CimPackage.ACDC_CONVERTER__UC:
            return isSetUc();
        case CimPackage.ACDC_CONVERTER__UDC:
            return isSetUdc();
        case CimPackage.ACDC_CONVERTER__VALVE_U0:
            return isSetValveU0();
        case CimPackage.ACDC_CONVERTER__DC_TERMINALS:
            return isSetDCTerminals();
        case CimPackage.ACDC_CONVERTER__PCC_TERMINAL:
            return isSetPccTerminal();
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
        result.append( " (baseS: " );
        if( baseSESet )
            result.append( baseS );
        else
            result.append( "<unset>" );
        result.append( ", idc: " );
        if( idcESet )
            result.append( idc );
        else
            result.append( "<unset>" );
        result.append( ", idleLoss: " );
        if( idleLossESet )
            result.append( idleLoss );
        else
            result.append( "<unset>" );
        result.append( ", maxUdc: " );
        if( maxUdcESet )
            result.append( maxUdc );
        else
            result.append( "<unset>" );
        result.append( ", minUdc: " );
        if( minUdcESet )
            result.append( minUdc );
        else
            result.append( "<unset>" );
        result.append( ", numberOfValves: " );
        if( numberOfValvesESet )
            result.append( numberOfValves );
        else
            result.append( "<unset>" );
        result.append( ", p: " );
        if( pESet )
            result.append( p );
        else
            result.append( "<unset>" );
        result.append( ", poleLossP: " );
        if( poleLossPESet )
            result.append( poleLossP );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ", ratedUdc: " );
        if( ratedUdcESet )
            result.append( ratedUdc );
        else
            result.append( "<unset>" );
        result.append( ", resistiveLoss: " );
        if( resistiveLossESet )
            result.append( resistiveLoss );
        else
            result.append( "<unset>" );
        result.append( ", switchingLoss: " );
        if( switchingLossESet )
            result.append( switchingLoss );
        else
            result.append( "<unset>" );
        result.append( ", targetPpcc: " );
        if( targetPpccESet )
            result.append( targetPpcc );
        else
            result.append( "<unset>" );
        result.append( ", targetUdc: " );
        if( targetUdcESet )
            result.append( targetUdc );
        else
            result.append( "<unset>" );
        result.append( ", uc: " );
        if( ucESet )
            result.append( uc );
        else
            result.append( "<unset>" );
        result.append( ", udc: " );
        if( udcESet )
            result.append( udc );
        else
            result.append( "<unset>" );
        result.append( ", valveU0: " );
        if( valveU0ESet )
            result.append( valveU0 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ACDCConverterImpl
