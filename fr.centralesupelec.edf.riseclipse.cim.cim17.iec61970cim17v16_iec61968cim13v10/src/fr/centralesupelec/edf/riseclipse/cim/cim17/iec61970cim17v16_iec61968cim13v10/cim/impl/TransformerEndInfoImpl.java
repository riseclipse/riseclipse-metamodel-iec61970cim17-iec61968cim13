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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerCoreAdmittance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerStarImpedance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindingConnection;

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
 * An implementation of the model object '<em><b>Transformer End Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getEmergencyS <em>Emergency S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getEndNumber <em>End Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getInsulationU <em>Insulation U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getPhaseAngleClock <em>Phase Angle Clock</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getShortTermS <em>Short Term S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getGroundedEndShortCircuitTests <em>Grounded End Short Circuit Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getEnergisedEndNoLoadTests <em>Energised End No Load Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getTransformerStarImpedance <em>Transformer Star Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getOpenEndOpenCircuitTests <em>Open End Open Circuit Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getToMeshImpedances <em>To Mesh Impedances</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getEnergisedEndShortCircuitTests <em>Energised End Short Circuit Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getEnergisedEndOpenCircuitTests <em>Energised End Open Circuit Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getTransformerTankInfo <em>Transformer Tank Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getCoreAdmittance <em>Core Admittance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndInfoImpl#getFromMeshImpedances <em>From Mesh Impedances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerEndInfoImpl extends AssetInfoImpl implements TransformerEndInfo {
    /**
     * The default value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionKind()
     * @generated
     * @ordered
     */
    protected static final WindingConnection CONNECTION_KIND_EDEFAULT = WindingConnection.D;

    /**
     * The cached value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionKind()
     * @generated
     * @ordered
     */
    protected WindingConnection connectionKind = CONNECTION_KIND_EDEFAULT;

    /**
     * This is true if the Connection Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectionKindESet;

    /**
     * The default value of the '{@link #getEmergencyS() <em>Emergency S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmergencyS()
     * @generated
     * @ordered
     */
    protected static final Float EMERGENCY_S_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmergencyS() <em>Emergency S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmergencyS()
     * @generated
     * @ordered
     */
    protected Float emergencyS = EMERGENCY_S_EDEFAULT;

    /**
     * This is true if the Emergency S attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean emergencySESet;

    /**
     * The default value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndNumber()
     * @generated
     * @ordered
     */
    protected static final Integer END_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndNumber()
     * @generated
     * @ordered
     */
    protected Integer endNumber = END_NUMBER_EDEFAULT;

    /**
     * This is true if the End Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endNumberESet;

    /**
     * The default value of the '{@link #getInsulationU() <em>Insulation U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulationU()
     * @generated
     * @ordered
     */
    protected static final Float INSULATION_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInsulationU() <em>Insulation U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulationU()
     * @generated
     * @ordered
     */
    protected Float insulationU = INSULATION_U_EDEFAULT;

    /**
     * This is true if the Insulation U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean insulationUESet;

    /**
     * The default value of the '{@link #getPhaseAngleClock() <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseAngleClock()
     * @generated
     * @ordered
     */
    protected static final Integer PHASE_ANGLE_CLOCK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhaseAngleClock() <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseAngleClock()
     * @generated
     * @ordered
     */
    protected Integer phaseAngleClock = PHASE_ANGLE_CLOCK_EDEFAULT;

    /**
     * This is true if the Phase Angle Clock attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseAngleClockESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected static final Float RATED_S_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected Float ratedS = RATED_S_EDEFAULT;

    /**
     * This is true if the Rated S attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedSESet;

    /**
     * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected static final Float RATED_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected Float ratedU = RATED_U_EDEFAULT;

    /**
     * This is true if the Rated U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedUESet;

    /**
     * The default value of the '{@link #getShortTermS() <em>Short Term S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortTermS()
     * @generated
     * @ordered
     */
    protected static final Float SHORT_TERM_S_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortTermS() <em>Short Term S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortTermS()
     * @generated
     * @ordered
     */
    protected Float shortTermS = SHORT_TERM_S_EDEFAULT;

    /**
     * This is true if the Short Term S attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shortTermSESet;

    /**
     * The cached value of the '{@link #getGroundedEndShortCircuitTests() <em>Grounded End Short Circuit Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroundedEndShortCircuitTests()
     * @generated
     * @ordered
     */
    protected EList< ShortCircuitTest > groundedEndShortCircuitTests;

    /**
     * The cached value of the '{@link #getEnergisedEndNoLoadTests() <em>Energised End No Load Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndNoLoadTests()
     * @generated
     * @ordered
     */
    protected EList< NoLoadTest > energisedEndNoLoadTests;

    /**
     * The cached value of the '{@link #getTransformerStarImpedance() <em>Transformer Star Impedance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerStarImpedance()
     * @generated
     * @ordered
     */
    protected TransformerStarImpedance transformerStarImpedance;

    /**
     * This is true if the Transformer Star Impedance reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerStarImpedanceESet;

    /**
     * The cached value of the '{@link #getOpenEndOpenCircuitTests() <em>Open End Open Circuit Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenEndOpenCircuitTests()
     * @generated
     * @ordered
     */
    protected EList< OpenCircuitTest > openEndOpenCircuitTests;

    /**
     * The cached value of the '{@link #getToMeshImpedances() <em>To Mesh Impedances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToMeshImpedances()
     * @generated
     * @ordered
     */
    protected EList< TransformerMeshImpedance > toMeshImpedances;

    /**
     * The cached value of the '{@link #getEnergisedEndShortCircuitTests() <em>Energised End Short Circuit Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndShortCircuitTests()
     * @generated
     * @ordered
     */
    protected EList< ShortCircuitTest > energisedEndShortCircuitTests;

    /**
     * The cached value of the '{@link #getEnergisedEndOpenCircuitTests() <em>Energised End Open Circuit Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndOpenCircuitTests()
     * @generated
     * @ordered
     */
    protected EList< OpenCircuitTest > energisedEndOpenCircuitTests;

    /**
     * The cached value of the '{@link #getTransformerTankInfo() <em>Transformer Tank Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerTankInfo()
     * @generated
     * @ordered
     */
    protected TransformerTankInfo transformerTankInfo;

    /**
     * This is true if the Transformer Tank Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerTankInfoESet;

    /**
     * The cached value of the '{@link #getCoreAdmittance() <em>Core Admittance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreAdmittance()
     * @generated
     * @ordered
     */
    protected TransformerCoreAdmittance coreAdmittance;

    /**
     * This is true if the Core Admittance reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreAdmittanceESet;

    /**
     * The cached value of the '{@link #getFromMeshImpedances() <em>From Mesh Impedances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromMeshImpedances()
     * @generated
     * @ordered
     */
    protected EList< TransformerMeshImpedance > fromMeshImpedances;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformerEndInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerEndInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindingConnection getConnectionKind() {
        return connectionKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectionKind( WindingConnection newConnectionKind ) {
        WindingConnection oldConnectionKind = connectionKind;
        connectionKind = newConnectionKind == null ? CONNECTION_KIND_EDEFAULT : newConnectionKind;
        boolean oldConnectionKindESet = connectionKindESet;
        connectionKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END_INFO__CONNECTION_KIND,
                    oldConnectionKind, connectionKind, !oldConnectionKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectionKind() {
        WindingConnection oldConnectionKind = connectionKind;
        boolean oldConnectionKindESet = connectionKindESet;
        connectionKind = CONNECTION_KIND_EDEFAULT;
        connectionKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END_INFO__CONNECTION_KIND,
                    oldConnectionKind, CONNECTION_KIND_EDEFAULT, oldConnectionKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectionKind() {
        return connectionKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEmergencyS() {
        return emergencyS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmergencyS( Float newEmergencyS ) {
        Float oldEmergencyS = emergencyS;
        emergencyS = newEmergencyS;
        boolean oldEmergencySESet = emergencySESet;
        emergencySESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END_INFO__EMERGENCY_S, oldEmergencyS, emergencyS, !oldEmergencySESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmergencyS() {
        Float oldEmergencyS = emergencyS;
        boolean oldEmergencySESet = emergencySESet;
        emergencyS = EMERGENCY_S_EDEFAULT;
        emergencySESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END_INFO__EMERGENCY_S,
                    oldEmergencyS, EMERGENCY_S_EDEFAULT, oldEmergencySESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmergencyS() {
        return emergencySESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getEndNumber() {
        return endNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEndNumber( Integer newEndNumber ) {
        Integer oldEndNumber = endNumber;
        endNumber = newEndNumber;
        boolean oldEndNumberESet = endNumberESet;
        endNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END_INFO__END_NUMBER, oldEndNumber, endNumber, !oldEndNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndNumber() {
        Integer oldEndNumber = endNumber;
        boolean oldEndNumberESet = endNumberESet;
        endNumber = END_NUMBER_EDEFAULT;
        endNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END_INFO__END_NUMBER, oldEndNumber, END_NUMBER_EDEFAULT, oldEndNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndNumber() {
        return endNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInsulationU() {
        return insulationU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInsulationU( Float newInsulationU ) {
        Float oldInsulationU = insulationU;
        insulationU = newInsulationU;
        boolean oldInsulationUESet = insulationUESet;
        insulationUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END_INFO__INSULATION_U, oldInsulationU, insulationU, !oldInsulationUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInsulationU() {
        Float oldInsulationU = insulationU;
        boolean oldInsulationUESet = insulationUESet;
        insulationU = INSULATION_U_EDEFAULT;
        insulationUESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END_INFO__INSULATION_U,
                    oldInsulationU, INSULATION_U_EDEFAULT, oldInsulationUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInsulationU() {
        return insulationUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPhaseAngleClock() {
        return phaseAngleClock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseAngleClock( Integer newPhaseAngleClock ) {
        Integer oldPhaseAngleClock = phaseAngleClock;
        phaseAngleClock = newPhaseAngleClock;
        boolean oldPhaseAngleClockESet = phaseAngleClockESet;
        phaseAngleClockESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK,
                    oldPhaseAngleClock, phaseAngleClock, !oldPhaseAngleClockESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseAngleClock() {
        Integer oldPhaseAngleClock = phaseAngleClock;
        boolean oldPhaseAngleClockESet = phaseAngleClockESet;
        phaseAngleClock = PHASE_ANGLE_CLOCK_EDEFAULT;
        phaseAngleClockESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK,
                        oldPhaseAngleClock, PHASE_ANGLE_CLOCK_EDEFAULT, oldPhaseAngleClockESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseAngleClock() {
        return phaseAngleClockESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END_INFO__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END_INFO__R, oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedS() {
        return ratedS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedS( Float newRatedS ) {
        Float oldRatedS = ratedS;
        ratedS = newRatedS;
        boolean oldRatedSESet = ratedSESet;
        ratedSESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END_INFO__RATED_S, oldRatedS, ratedS, !oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedS() {
        Float oldRatedS = ratedS;
        boolean oldRatedSESet = ratedSESet;
        ratedS = RATED_S_EDEFAULT;
        ratedSESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END_INFO__RATED_S, oldRatedS, RATED_S_EDEFAULT, oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedS() {
        return ratedSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedU() {
        return ratedU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedU( Float newRatedU ) {
        Float oldRatedU = ratedU;
        ratedU = newRatedU;
        boolean oldRatedUESet = ratedUESet;
        ratedUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END_INFO__RATED_U, oldRatedU, ratedU, !oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedU() {
        Float oldRatedU = ratedU;
        boolean oldRatedUESet = ratedUESet;
        ratedU = RATED_U_EDEFAULT;
        ratedUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END_INFO__RATED_U, oldRatedU, RATED_U_EDEFAULT, oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedU() {
        return ratedUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShortTermS() {
        return shortTermS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortTermS( Float newShortTermS ) {
        Float oldShortTermS = shortTermS;
        shortTermS = newShortTermS;
        boolean oldShortTermSESet = shortTermSESet;
        shortTermSESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END_INFO__SHORT_TERM_S, oldShortTermS, shortTermS, !oldShortTermSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShortTermS() {
        Float oldShortTermS = shortTermS;
        boolean oldShortTermSESet = shortTermSESet;
        shortTermS = SHORT_TERM_S_EDEFAULT;
        shortTermSESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END_INFO__SHORT_TERM_S,
                    oldShortTermS, SHORT_TERM_S_EDEFAULT, oldShortTermSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShortTermS() {
        return shortTermSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ShortCircuitTest > getGroundedEndShortCircuitTests() {
        if( groundedEndShortCircuitTests == null ) {
            groundedEndShortCircuitTests = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ShortCircuitTest >(
                    ShortCircuitTest.class, this, CimPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS,
                    CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS );
        }
        return groundedEndShortCircuitTests;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGroundedEndShortCircuitTests() {
        if( groundedEndShortCircuitTests != null )
            ( ( InternalEList.Unsettable< ? > ) groundedEndShortCircuitTests ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGroundedEndShortCircuitTests() {
        return groundedEndShortCircuitTests != null
                && ( ( InternalEList.Unsettable< ? > ) groundedEndShortCircuitTests ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< NoLoadTest > getEnergisedEndNoLoadTests() {
        if( energisedEndNoLoadTests == null ) {
            energisedEndNoLoadTests = new EObjectWithInverseResolvingEList.Unsettable< NoLoadTest >( NoLoadTest.class,
                    this, CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS,
                    CimPackage.NO_LOAD_TEST__ENERGISED_END );
        }
        return energisedEndNoLoadTests;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergisedEndNoLoadTests() {
        if( energisedEndNoLoadTests != null ) ( ( InternalEList.Unsettable< ? > ) energisedEndNoLoadTests ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEndNoLoadTests() {
        return energisedEndNoLoadTests != null && ( ( InternalEList.Unsettable< ? > ) energisedEndNoLoadTests ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerStarImpedance getTransformerStarImpedance() {
        if( transformerStarImpedance != null && transformerStarImpedance.eIsProxy() ) {
            InternalEObject oldTransformerStarImpedance = ( InternalEObject ) transformerStarImpedance;
            transformerStarImpedance = ( TransformerStarImpedance ) eResolveProxy( oldTransformerStarImpedance );
            if( transformerStarImpedance != oldTransformerStarImpedance ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, oldTransformerStarImpedance,
                        transformerStarImpedance ) );
            }
        }
        return transformerStarImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformerStarImpedance basicGetTransformerStarImpedance() {
        return transformerStarImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformerStarImpedance( TransformerStarImpedance newTransformerStarImpedance,
            NotificationChain msgs ) {
        TransformerStarImpedance oldTransformerStarImpedance = transformerStarImpedance;
        transformerStarImpedance = newTransformerStarImpedance;
        boolean oldTransformerStarImpedanceESet = transformerStarImpedanceESet;
        transformerStarImpedanceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, oldTransformerStarImpedance,
                    newTransformerStarImpedance, !oldTransformerStarImpedanceESet );
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
    public void setTransformerStarImpedance( TransformerStarImpedance newTransformerStarImpedance ) {
        if( newTransformerStarImpedance != transformerStarImpedance ) {
            NotificationChain msgs = null;
            if( transformerStarImpedance != null )
                msgs = ( ( InternalEObject ) transformerStarImpedance ).eInverseRemove( this,
                        CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO, TransformerStarImpedance.class,
                        msgs );
            if( newTransformerStarImpedance != null )
                msgs = ( ( InternalEObject ) newTransformerStarImpedance ).eInverseAdd( this,
                        CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO, TransformerStarImpedance.class,
                        msgs );
            msgs = basicSetTransformerStarImpedance( newTransformerStarImpedance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerStarImpedanceESet = transformerStarImpedanceESet;
            transformerStarImpedanceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, newTransformerStarImpedance,
                    newTransformerStarImpedance, !oldTransformerStarImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTransformerStarImpedance( NotificationChain msgs ) {
        TransformerStarImpedance oldTransformerStarImpedance = transformerStarImpedance;
        transformerStarImpedance = null;
        boolean oldTransformerStarImpedanceESet = transformerStarImpedanceESet;
        transformerStarImpedanceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, oldTransformerStarImpedance, null,
                    oldTransformerStarImpedanceESet );
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
    public void unsetTransformerStarImpedance() {
        if( transformerStarImpedance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) transformerStarImpedance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO, TransformerStarImpedance.class, msgs );
            msgs = basicUnsetTransformerStarImpedance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerStarImpedanceESet = transformerStarImpedanceESet;
            transformerStarImpedanceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, null, null,
                    oldTransformerStarImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerStarImpedance() {
        return transformerStarImpedanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OpenCircuitTest > getOpenEndOpenCircuitTests() {
        if( openEndOpenCircuitTests == null ) {
            openEndOpenCircuitTests = new EObjectWithInverseResolvingEList.Unsettable< OpenCircuitTest >(
                    OpenCircuitTest.class, this, CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS,
                    CimPackage.OPEN_CIRCUIT_TEST__OPEN_END );
        }
        return openEndOpenCircuitTests;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpenEndOpenCircuitTests() {
        if( openEndOpenCircuitTests != null ) ( ( InternalEList.Unsettable< ? > ) openEndOpenCircuitTests ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpenEndOpenCircuitTests() {
        return openEndOpenCircuitTests != null && ( ( InternalEList.Unsettable< ? > ) openEndOpenCircuitTests ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerMeshImpedance > getToMeshImpedances() {
        if( toMeshImpedances == null ) {
            toMeshImpedances = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< TransformerMeshImpedance >(
                    TransformerMeshImpedance.class, this, CimPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCES,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFOS );
        }
        return toMeshImpedances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToMeshImpedances() {
        if( toMeshImpedances != null ) ( ( InternalEList.Unsettable< ? > ) toMeshImpedances ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToMeshImpedances() {
        return toMeshImpedances != null && ( ( InternalEList.Unsettable< ? > ) toMeshImpedances ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ShortCircuitTest > getEnergisedEndShortCircuitTests() {
        if( energisedEndShortCircuitTests == null ) {
            energisedEndShortCircuitTests = new EObjectWithInverseResolvingEList.Unsettable< ShortCircuitTest >(
                    ShortCircuitTest.class, this, CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS,
                    CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END );
        }
        return energisedEndShortCircuitTests;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergisedEndShortCircuitTests() {
        if( energisedEndShortCircuitTests != null )
            ( ( InternalEList.Unsettable< ? > ) energisedEndShortCircuitTests ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEndShortCircuitTests() {
        return energisedEndShortCircuitTests != null
                && ( ( InternalEList.Unsettable< ? > ) energisedEndShortCircuitTests ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OpenCircuitTest > getEnergisedEndOpenCircuitTests() {
        if( energisedEndOpenCircuitTests == null ) {
            energisedEndOpenCircuitTests = new EObjectWithInverseResolvingEList.Unsettable< OpenCircuitTest >(
                    OpenCircuitTest.class, this, CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS,
                    CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END );
        }
        return energisedEndOpenCircuitTests;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergisedEndOpenCircuitTests() {
        if( energisedEndOpenCircuitTests != null )
            ( ( InternalEList.Unsettable< ? > ) energisedEndOpenCircuitTests ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEndOpenCircuitTests() {
        return energisedEndOpenCircuitTests != null
                && ( ( InternalEList.Unsettable< ? > ) energisedEndOpenCircuitTests ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerTankInfo getTransformerTankInfo() {
        return transformerTankInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformerTankInfo( TransformerTankInfo newTransformerTankInfo,
            NotificationChain msgs ) {
        TransformerTankInfo oldTransformerTankInfo = transformerTankInfo;
        transformerTankInfo = newTransformerTankInfo;
        boolean oldTransformerTankInfoESet = transformerTankInfoESet;
        transformerTankInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO, oldTransformerTankInfo,
                    newTransformerTankInfo, !oldTransformerTankInfoESet );
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
    public void setTransformerTankInfo( TransformerTankInfo newTransformerTankInfo ) {
        if( newTransformerTankInfo != transformerTankInfo ) {
            NotificationChain msgs = null;
            if( transformerTankInfo != null ) msgs = ( ( InternalEObject ) transformerTankInfo ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS, TransformerTankInfo.class, msgs );
            if( newTransformerTankInfo != null )
                msgs = ( ( InternalEObject ) newTransformerTankInfo ).eInverseAdd( this,
                        CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS, TransformerTankInfo.class, msgs );
            msgs = basicSetTransformerTankInfo( newTransformerTankInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerTankInfoESet = transformerTankInfoESet;
            transformerTankInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO, newTransformerTankInfo,
                    newTransformerTankInfo, !oldTransformerTankInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTransformerTankInfo( NotificationChain msgs ) {
        TransformerTankInfo oldTransformerTankInfo = transformerTankInfo;
        transformerTankInfo = null;
        boolean oldTransformerTankInfoESet = transformerTankInfoESet;
        transformerTankInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO, oldTransformerTankInfo, null,
                    oldTransformerTankInfoESet );
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
    public void unsetTransformerTankInfo() {
        if( transformerTankInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) transformerTankInfo ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS, TransformerTankInfo.class, msgs );
            msgs = basicUnsetTransformerTankInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerTankInfoESet = transformerTankInfoESet;
            transformerTankInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO, null, null, oldTransformerTankInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerTankInfo() {
        return transformerTankInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerCoreAdmittance getCoreAdmittance() {
        if( coreAdmittance != null && coreAdmittance.eIsProxy() ) {
            InternalEObject oldCoreAdmittance = ( InternalEObject ) coreAdmittance;
            coreAdmittance = ( TransformerCoreAdmittance ) eResolveProxy( oldCoreAdmittance );
            if( coreAdmittance != oldCoreAdmittance ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, oldCoreAdmittance, coreAdmittance ) );
            }
        }
        return coreAdmittance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformerCoreAdmittance basicGetCoreAdmittance() {
        return coreAdmittance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCoreAdmittance( TransformerCoreAdmittance newCoreAdmittance,
            NotificationChain msgs ) {
        TransformerCoreAdmittance oldCoreAdmittance = coreAdmittance;
        coreAdmittance = newCoreAdmittance;
        boolean oldCoreAdmittanceESet = coreAdmittanceESet;
        coreAdmittanceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, oldCoreAdmittance, newCoreAdmittance,
                    !oldCoreAdmittanceESet );
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
    public void setCoreAdmittance( TransformerCoreAdmittance newCoreAdmittance ) {
        if( newCoreAdmittance != coreAdmittance ) {
            NotificationChain msgs = null;
            if( coreAdmittance != null ) msgs = ( ( InternalEObject ) coreAdmittance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, TransformerCoreAdmittance.class,
                    msgs );
            if( newCoreAdmittance != null ) msgs = ( ( InternalEObject ) newCoreAdmittance ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, TransformerCoreAdmittance.class,
                    msgs );
            msgs = basicSetCoreAdmittance( newCoreAdmittance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCoreAdmittanceESet = coreAdmittanceESet;
            coreAdmittanceESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE,
                            newCoreAdmittance, newCoreAdmittance, !oldCoreAdmittanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCoreAdmittance( NotificationChain msgs ) {
        TransformerCoreAdmittance oldCoreAdmittance = coreAdmittance;
        coreAdmittance = null;
        boolean oldCoreAdmittanceESet = coreAdmittanceESet;
        coreAdmittanceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, oldCoreAdmittance, null, oldCoreAdmittanceESet );
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
    public void unsetCoreAdmittance() {
        if( coreAdmittance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) coreAdmittance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, TransformerCoreAdmittance.class,
                    msgs );
            msgs = basicUnsetCoreAdmittance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCoreAdmittanceESet = coreAdmittanceESet;
            coreAdmittanceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, null, null, oldCoreAdmittanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreAdmittance() {
        return coreAdmittanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerMeshImpedance > getFromMeshImpedances() {
        if( fromMeshImpedances == null ) {
            fromMeshImpedances = new EObjectWithInverseResolvingEList.Unsettable< TransformerMeshImpedance >(
                    TransformerMeshImpedance.class, this, CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO );
        }
        return fromMeshImpedances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFromMeshImpedances() {
        if( fromMeshImpedances != null ) ( ( InternalEList.Unsettable< ? > ) fromMeshImpedances ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFromMeshImpedances() {
        return fromMeshImpedances != null && ( ( InternalEList.Unsettable< ? > ) fromMeshImpedances ).isSet();
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
        case CimPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGroundedEndShortCircuitTests() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnergisedEndNoLoadTests() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE:
            if( transformerStarImpedance != null )
                msgs = ( ( InternalEObject ) transformerStarImpedance ).eInverseRemove( this,
                        CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO, TransformerStarImpedance.class,
                        msgs );
            return basicSetTransformerStarImpedance( ( TransformerStarImpedance ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOpenEndOpenCircuitTests() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getToMeshImpedances() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnergisedEndShortCircuitTests() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnergisedEndOpenCircuitTests() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
            if( transformerTankInfo != null ) msgs = ( ( InternalEObject ) transformerTankInfo ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS, TransformerTankInfo.class, msgs );
            return basicSetTransformerTankInfo( ( TransformerTankInfo ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
            if( coreAdmittance != null ) msgs = ( ( InternalEObject ) coreAdmittance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, TransformerCoreAdmittance.class,
                    msgs );
            return basicSetCoreAdmittance( ( TransformerCoreAdmittance ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFromMeshImpedances() )
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
        case CimPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
            return ( ( InternalEList< ? > ) getGroundedEndShortCircuitTests() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS:
            return ( ( InternalEList< ? > ) getEnergisedEndNoLoadTests() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE:
            return basicUnsetTransformerStarImpedance( msgs );
        case CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
            return ( ( InternalEList< ? > ) getOpenEndOpenCircuitTests() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCES:
            return ( ( InternalEList< ? > ) getToMeshImpedances() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
            return ( ( InternalEList< ? > ) getEnergisedEndShortCircuitTests() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
            return ( ( InternalEList< ? > ) getEnergisedEndOpenCircuitTests() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
            return basicUnsetTransformerTankInfo( msgs );
        case CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
            return basicUnsetCoreAdmittance( msgs );
        case CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES:
            return ( ( InternalEList< ? > ) getFromMeshImpedances() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
            return getConnectionKind();
        case CimPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
            return getEmergencyS();
        case CimPackage.TRANSFORMER_END_INFO__END_NUMBER:
            return getEndNumber();
        case CimPackage.TRANSFORMER_END_INFO__INSULATION_U:
            return getInsulationU();
        case CimPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
            return getPhaseAngleClock();
        case CimPackage.TRANSFORMER_END_INFO__R:
            return getR();
        case CimPackage.TRANSFORMER_END_INFO__RATED_S:
            return getRatedS();
        case CimPackage.TRANSFORMER_END_INFO__RATED_U:
            return getRatedU();
        case CimPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
            return getShortTermS();
        case CimPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
            return getGroundedEndShortCircuitTests();
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS:
            return getEnergisedEndNoLoadTests();
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE:
            if( resolve ) return getTransformerStarImpedance();
            return basicGetTransformerStarImpedance();
        case CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
            return getOpenEndOpenCircuitTests();
        case CimPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCES:
            return getToMeshImpedances();
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
            return getEnergisedEndShortCircuitTests();
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
            return getEnergisedEndOpenCircuitTests();
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
            return getTransformerTankInfo();
        case CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
            if( resolve ) return getCoreAdmittance();
            return basicGetCoreAdmittance();
        case CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES:
            return getFromMeshImpedances();
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
        case CimPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
            setConnectionKind( ( WindingConnection ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
            setEmergencyS( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__END_NUMBER:
            setEndNumber( ( Integer ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__INSULATION_U:
            setInsulationU( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
            setPhaseAngleClock( ( Integer ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__RATED_S:
            setRatedS( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__RATED_U:
            setRatedU( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
            setShortTermS( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
            getGroundedEndShortCircuitTests().clear();
            getGroundedEndShortCircuitTests().addAll( ( Collection< ? extends ShortCircuitTest > ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS:
            getEnergisedEndNoLoadTests().clear();
            getEnergisedEndNoLoadTests().addAll( ( Collection< ? extends NoLoadTest > ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE:
            setTransformerStarImpedance( ( TransformerStarImpedance ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
            getOpenEndOpenCircuitTests().clear();
            getOpenEndOpenCircuitTests().addAll( ( Collection< ? extends OpenCircuitTest > ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCES:
            getToMeshImpedances().clear();
            getToMeshImpedances().addAll( ( Collection< ? extends TransformerMeshImpedance > ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
            getEnergisedEndShortCircuitTests().clear();
            getEnergisedEndShortCircuitTests().addAll( ( Collection< ? extends ShortCircuitTest > ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
            getEnergisedEndOpenCircuitTests().clear();
            getEnergisedEndOpenCircuitTests().addAll( ( Collection< ? extends OpenCircuitTest > ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
            setTransformerTankInfo( ( TransformerTankInfo ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
            setCoreAdmittance( ( TransformerCoreAdmittance ) newValue );
            return;
        case CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES:
            getFromMeshImpedances().clear();
            getFromMeshImpedances().addAll( ( Collection< ? extends TransformerMeshImpedance > ) newValue );
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
        case CimPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
            unsetConnectionKind();
            return;
        case CimPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
            unsetEmergencyS();
            return;
        case CimPackage.TRANSFORMER_END_INFO__END_NUMBER:
            unsetEndNumber();
            return;
        case CimPackage.TRANSFORMER_END_INFO__INSULATION_U:
            unsetInsulationU();
            return;
        case CimPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
            unsetPhaseAngleClock();
            return;
        case CimPackage.TRANSFORMER_END_INFO__R:
            unsetR();
            return;
        case CimPackage.TRANSFORMER_END_INFO__RATED_S:
            unsetRatedS();
            return;
        case CimPackage.TRANSFORMER_END_INFO__RATED_U:
            unsetRatedU();
            return;
        case CimPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
            unsetShortTermS();
            return;
        case CimPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
            unsetGroundedEndShortCircuitTests();
            return;
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS:
            unsetEnergisedEndNoLoadTests();
            return;
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE:
            unsetTransformerStarImpedance();
            return;
        case CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
            unsetOpenEndOpenCircuitTests();
            return;
        case CimPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCES:
            unsetToMeshImpedances();
            return;
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
            unsetEnergisedEndShortCircuitTests();
            return;
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
            unsetEnergisedEndOpenCircuitTests();
            return;
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
            unsetTransformerTankInfo();
            return;
        case CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
            unsetCoreAdmittance();
            return;
        case CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES:
            unsetFromMeshImpedances();
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
        case CimPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
            return isSetConnectionKind();
        case CimPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
            return isSetEmergencyS();
        case CimPackage.TRANSFORMER_END_INFO__END_NUMBER:
            return isSetEndNumber();
        case CimPackage.TRANSFORMER_END_INFO__INSULATION_U:
            return isSetInsulationU();
        case CimPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
            return isSetPhaseAngleClock();
        case CimPackage.TRANSFORMER_END_INFO__R:
            return isSetR();
        case CimPackage.TRANSFORMER_END_INFO__RATED_S:
            return isSetRatedS();
        case CimPackage.TRANSFORMER_END_INFO__RATED_U:
            return isSetRatedU();
        case CimPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
            return isSetShortTermS();
        case CimPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
            return isSetGroundedEndShortCircuitTests();
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS:
            return isSetEnergisedEndNoLoadTests();
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE:
            return isSetTransformerStarImpedance();
        case CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
            return isSetOpenEndOpenCircuitTests();
        case CimPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCES:
            return isSetToMeshImpedances();
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
            return isSetEnergisedEndShortCircuitTests();
        case CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
            return isSetEnergisedEndOpenCircuitTests();
        case CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
            return isSetTransformerTankInfo();
        case CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
            return isSetCoreAdmittance();
        case CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES:
            return isSetFromMeshImpedances();
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
        result.append( " (connectionKind: " );
        if( connectionKindESet )
            result.append( connectionKind );
        else
            result.append( "<unset>" );
        result.append( ", emergencyS: " );
        if( emergencySESet )
            result.append( emergencyS );
        else
            result.append( "<unset>" );
        result.append( ", endNumber: " );
        if( endNumberESet )
            result.append( endNumber );
        else
            result.append( "<unset>" );
        result.append( ", insulationU: " );
        if( insulationUESet )
            result.append( insulationU );
        else
            result.append( "<unset>" );
        result.append( ", phaseAngleClock: " );
        if( phaseAngleClockESet )
            result.append( phaseAngleClock );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", ratedS: " );
        if( ratedSESet )
            result.append( ratedS );
        else
            result.append( "<unset>" );
        result.append( ", ratedU: " );
        if( ratedUESet )
            result.append( ratedU );
        else
            result.append( "<unset>" );
        result.append( ", shortTermS: " );
        if( shortTermSESet )
            result.append( shortTermS );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TransformerEndInfoImpl
