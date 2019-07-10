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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Network Injection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getIkSecond <em>Ik Second</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getReferencePriority <em>Reference Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExternalNetworkInjectionImpl#getVoltageFactor <em>Voltage Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalNetworkInjectionImpl extends RegulatingCondEqImpl implements ExternalNetworkInjection {
    /**
     * The default value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorSCD()
     * @generated
     * @ordered
     */
    protected static final Float GOVERNOR_SCD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorSCD()
     * @generated
     * @ordered
     */
    protected Float governorSCD = GOVERNOR_SCD_EDEFAULT;

    /**
     * This is true if the Governor SCD attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean governorSCDESet;

    /**
     * The default value of the '{@link #getIkSecond() <em>Ik Second</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIkSecond()
     * @generated
     * @ordered
     */
    protected static final Boolean IK_SECOND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIkSecond() <em>Ik Second</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIkSecond()
     * @generated
     * @ordered
     */
    protected Boolean ikSecond = IK_SECOND_EDEFAULT;

    /**
     * This is true if the Ik Second attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ikSecondESet;

    /**
     * The default value of the '{@link #getMaxInitialSymShCCurrent() <em>Max Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxInitialSymShCCurrent()
     * @generated
     * @ordered
     */
    protected static final Float MAX_INITIAL_SYM_SH_CCURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxInitialSymShCCurrent() <em>Max Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxInitialSymShCCurrent()
     * @generated
     * @ordered
     */
    protected Float maxInitialSymShCCurrent = MAX_INITIAL_SYM_SH_CCURRENT_EDEFAULT;

    /**
     * This is true if the Max Initial Sym Sh CCurrent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxInitialSymShCCurrentESet;

    /**
     * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxP()
     * @generated
     * @ordered
     */
    protected static final Float MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxP()
     * @generated
     * @ordered
     */
    protected Float maxP = MAX_P_EDEFAULT;

    /**
     * This is true if the Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxPESet;

    /**
     * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected static final Float MAX_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected Float maxQ = MAX_Q_EDEFAULT;

    /**
     * This is true if the Max Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxQESet;

    /**
     * The default value of the '{@link #getMaxR0ToX0Ratio() <em>Max R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxR0ToX0Ratio()
     * @generated
     * @ordered
     */
    protected static final Float MAX_R0_TO_X0_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxR0ToX0Ratio() <em>Max R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxR0ToX0Ratio()
     * @generated
     * @ordered
     */
    protected Float maxR0ToX0Ratio = MAX_R0_TO_X0_RATIO_EDEFAULT;

    /**
     * This is true if the Max R0 To X0 Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxR0ToX0RatioESet;

    /**
     * The default value of the '{@link #getMaxR1ToX1Ratio() <em>Max R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxR1ToX1Ratio()
     * @generated
     * @ordered
     */
    protected static final Float MAX_R1_TO_X1_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxR1ToX1Ratio() <em>Max R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxR1ToX1Ratio()
     * @generated
     * @ordered
     */
    protected Float maxR1ToX1Ratio = MAX_R1_TO_X1_RATIO_EDEFAULT;

    /**
     * This is true if the Max R1 To X1 Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxR1ToX1RatioESet;

    /**
     * The default value of the '{@link #getMaxZ0ToZ1Ratio() <em>Max Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxZ0ToZ1Ratio()
     * @generated
     * @ordered
     */
    protected static final Float MAX_Z0_TO_Z1_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxZ0ToZ1Ratio() <em>Max Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxZ0ToZ1Ratio()
     * @generated
     * @ordered
     */
    protected Float maxZ0ToZ1Ratio = MAX_Z0_TO_Z1_RATIO_EDEFAULT;

    /**
     * This is true if the Max Z0 To Z1 Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxZ0ToZ1RatioESet;

    /**
     * The default value of the '{@link #getMinInitialSymShCCurrent() <em>Min Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinInitialSymShCCurrent()
     * @generated
     * @ordered
     */
    protected static final Float MIN_INITIAL_SYM_SH_CCURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinInitialSymShCCurrent() <em>Min Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinInitialSymShCCurrent()
     * @generated
     * @ordered
     */
    protected Float minInitialSymShCCurrent = MIN_INITIAL_SYM_SH_CCURRENT_EDEFAULT;

    /**
     * This is true if the Min Initial Sym Sh CCurrent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minInitialSymShCCurrentESet;

    /**
     * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinP()
     * @generated
     * @ordered
     */
    protected static final Float MIN_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinP()
     * @generated
     * @ordered
     */
    protected Float minP = MIN_P_EDEFAULT;

    /**
     * This is true if the Min P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minPESet;

    /**
     * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected static final Float MIN_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected Float minQ = MIN_Q_EDEFAULT;

    /**
     * This is true if the Min Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minQESet;

    /**
     * The default value of the '{@link #getMinR0ToX0Ratio() <em>Min R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinR0ToX0Ratio()
     * @generated
     * @ordered
     */
    protected static final Float MIN_R0_TO_X0_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinR0ToX0Ratio() <em>Min R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinR0ToX0Ratio()
     * @generated
     * @ordered
     */
    protected Float minR0ToX0Ratio = MIN_R0_TO_X0_RATIO_EDEFAULT;

    /**
     * This is true if the Min R0 To X0 Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minR0ToX0RatioESet;

    /**
     * The default value of the '{@link #getMinR1ToX1Ratio() <em>Min R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinR1ToX1Ratio()
     * @generated
     * @ordered
     */
    protected static final Float MIN_R1_TO_X1_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinR1ToX1Ratio() <em>Min R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinR1ToX1Ratio()
     * @generated
     * @ordered
     */
    protected Float minR1ToX1Ratio = MIN_R1_TO_X1_RATIO_EDEFAULT;

    /**
     * This is true if the Min R1 To X1 Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minR1ToX1RatioESet;

    /**
     * The default value of the '{@link #getMinZ0ToZ1Ratio() <em>Min Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinZ0ToZ1Ratio()
     * @generated
     * @ordered
     */
    protected static final Float MIN_Z0_TO_Z1_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinZ0ToZ1Ratio() <em>Min Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinZ0ToZ1Ratio()
     * @generated
     * @ordered
     */
    protected Float minZ0ToZ1Ratio = MIN_Z0_TO_Z1_RATIO_EDEFAULT;

    /**
     * This is true if the Min Z0 To Z1 Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minZ0ToZ1RatioESet;

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
     * The default value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencePriority()
     * @generated
     * @ordered
     */
    protected static final Integer REFERENCE_PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencePriority()
     * @generated
     * @ordered
     */
    protected Integer referencePriority = REFERENCE_PRIORITY_EDEFAULT;

    /**
     * This is true if the Reference Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean referencePriorityESet;

    /**
     * The default value of the '{@link #getVoltageFactor() <em>Voltage Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageFactor()
     * @generated
     * @ordered
     */
    protected static final Float VOLTAGE_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageFactor() <em>Voltage Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageFactor()
     * @generated
     * @ordered
     */
    protected Float voltageFactor = VOLTAGE_FACTOR_EDEFAULT;

    /**
     * This is true if the Voltage Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageFactorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExternalNetworkInjectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExternalNetworkInjection();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGovernorSCD() {
        return governorSCD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGovernorSCD( Float newGovernorSCD ) {
        Float oldGovernorSCD = governorSCD;
        governorSCD = newGovernorSCD;
        boolean oldGovernorSCDESet = governorSCDESet;
        governorSCDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXTERNAL_NETWORK_INJECTION__GOVERNOR_SCD,
                    oldGovernorSCD, governorSCD, !oldGovernorSCDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGovernorSCD() {
        Float oldGovernorSCD = governorSCD;
        boolean oldGovernorSCDESet = governorSCDESet;
        governorSCD = GOVERNOR_SCD_EDEFAULT;
        governorSCDESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.EXTERNAL_NETWORK_INJECTION__GOVERNOR_SCD,
                        oldGovernorSCD, GOVERNOR_SCD_EDEFAULT, oldGovernorSCDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGovernorSCD() {
        return governorSCDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIkSecond() {
        return ikSecond;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIkSecond( Boolean newIkSecond ) {
        Boolean oldIkSecond = ikSecond;
        ikSecond = newIkSecond;
        boolean oldIkSecondESet = ikSecondESet;
        ikSecondESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__IK_SECOND, oldIkSecond, ikSecond, !oldIkSecondESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIkSecond() {
        Boolean oldIkSecond = ikSecond;
        boolean oldIkSecondESet = ikSecondESet;
        ikSecond = IK_SECOND_EDEFAULT;
        ikSecondESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__IK_SECOND, oldIkSecond, IK_SECOND_EDEFAULT, oldIkSecondESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIkSecond() {
        return ikSecondESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxInitialSymShCCurrent() {
        return maxInitialSymShCCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxInitialSymShCCurrent( Float newMaxInitialSymShCCurrent ) {
        Float oldMaxInitialSymShCCurrent = maxInitialSymShCCurrent;
        maxInitialSymShCCurrent = newMaxInitialSymShCCurrent;
        boolean oldMaxInitialSymShCCurrentESet = maxInitialSymShCCurrentESet;
        maxInitialSymShCCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_INITIAL_SYM_SH_CCURRENT, oldMaxInitialSymShCCurrent,
                maxInitialSymShCCurrent, !oldMaxInitialSymShCCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxInitialSymShCCurrent() {
        Float oldMaxInitialSymShCCurrent = maxInitialSymShCCurrent;
        boolean oldMaxInitialSymShCCurrentESet = maxInitialSymShCCurrentESet;
        maxInitialSymShCCurrent = MAX_INITIAL_SYM_SH_CCURRENT_EDEFAULT;
        maxInitialSymShCCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_INITIAL_SYM_SH_CCURRENT, oldMaxInitialSymShCCurrent,
                MAX_INITIAL_SYM_SH_CCURRENT_EDEFAULT, oldMaxInitialSymShCCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxInitialSymShCCurrent() {
        return maxInitialSymShCCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxP() {
        return maxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxP( Float newMaxP ) {
        Float oldMaxP = maxP;
        maxP = newMaxP;
        boolean oldMaxPESet = maxPESet;
        maxPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_P, oldMaxP, maxP, !oldMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxP() {
        Float oldMaxP = maxP;
        boolean oldMaxPESet = maxPESet;
        maxP = MAX_P_EDEFAULT;
        maxPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_P, oldMaxP, MAX_P_EDEFAULT, oldMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxP() {
        return maxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxQ() {
        return maxQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxQ( Float newMaxQ ) {
        Float oldMaxQ = maxQ;
        maxQ = newMaxQ;
        boolean oldMaxQESet = maxQESet;
        maxQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Q, oldMaxQ, maxQ, !oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxQ() {
        Float oldMaxQ = maxQ;
        boolean oldMaxQESet = maxQESet;
        maxQ = MAX_Q_EDEFAULT;
        maxQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Q, oldMaxQ, MAX_Q_EDEFAULT, oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxQ() {
        return maxQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxR0ToX0Ratio() {
        return maxR0ToX0Ratio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxR0ToX0Ratio( Float newMaxR0ToX0Ratio ) {
        Float oldMaxR0ToX0Ratio = maxR0ToX0Ratio;
        maxR0ToX0Ratio = newMaxR0ToX0Ratio;
        boolean oldMaxR0ToX0RatioESet = maxR0ToX0RatioESet;
        maxR0ToX0RatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R0_TO_X0_RATIO, oldMaxR0ToX0Ratio, maxR0ToX0Ratio,
                !oldMaxR0ToX0RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxR0ToX0Ratio() {
        Float oldMaxR0ToX0Ratio = maxR0ToX0Ratio;
        boolean oldMaxR0ToX0RatioESet = maxR0ToX0RatioESet;
        maxR0ToX0Ratio = MAX_R0_TO_X0_RATIO_EDEFAULT;
        maxR0ToX0RatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R0_TO_X0_RATIO, oldMaxR0ToX0Ratio,
                MAX_R0_TO_X0_RATIO_EDEFAULT, oldMaxR0ToX0RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxR0ToX0Ratio() {
        return maxR0ToX0RatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxR1ToX1Ratio() {
        return maxR1ToX1Ratio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxR1ToX1Ratio( Float newMaxR1ToX1Ratio ) {
        Float oldMaxR1ToX1Ratio = maxR1ToX1Ratio;
        maxR1ToX1Ratio = newMaxR1ToX1Ratio;
        boolean oldMaxR1ToX1RatioESet = maxR1ToX1RatioESet;
        maxR1ToX1RatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R1_TO_X1_RATIO, oldMaxR1ToX1Ratio, maxR1ToX1Ratio,
                !oldMaxR1ToX1RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxR1ToX1Ratio() {
        Float oldMaxR1ToX1Ratio = maxR1ToX1Ratio;
        boolean oldMaxR1ToX1RatioESet = maxR1ToX1RatioESet;
        maxR1ToX1Ratio = MAX_R1_TO_X1_RATIO_EDEFAULT;
        maxR1ToX1RatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R1_TO_X1_RATIO, oldMaxR1ToX1Ratio,
                MAX_R1_TO_X1_RATIO_EDEFAULT, oldMaxR1ToX1RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxR1ToX1Ratio() {
        return maxR1ToX1RatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxZ0ToZ1Ratio() {
        return maxZ0ToZ1Ratio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxZ0ToZ1Ratio( Float newMaxZ0ToZ1Ratio ) {
        Float oldMaxZ0ToZ1Ratio = maxZ0ToZ1Ratio;
        maxZ0ToZ1Ratio = newMaxZ0ToZ1Ratio;
        boolean oldMaxZ0ToZ1RatioESet = maxZ0ToZ1RatioESet;
        maxZ0ToZ1RatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Z0_TO_Z1_RATIO, oldMaxZ0ToZ1Ratio, maxZ0ToZ1Ratio,
                !oldMaxZ0ToZ1RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxZ0ToZ1Ratio() {
        Float oldMaxZ0ToZ1Ratio = maxZ0ToZ1Ratio;
        boolean oldMaxZ0ToZ1RatioESet = maxZ0ToZ1RatioESet;
        maxZ0ToZ1Ratio = MAX_Z0_TO_Z1_RATIO_EDEFAULT;
        maxZ0ToZ1RatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Z0_TO_Z1_RATIO, oldMaxZ0ToZ1Ratio,
                MAX_Z0_TO_Z1_RATIO_EDEFAULT, oldMaxZ0ToZ1RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxZ0ToZ1Ratio() {
        return maxZ0ToZ1RatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinInitialSymShCCurrent() {
        return minInitialSymShCCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinInitialSymShCCurrent( Float newMinInitialSymShCCurrent ) {
        Float oldMinInitialSymShCCurrent = minInitialSymShCCurrent;
        minInitialSymShCCurrent = newMinInitialSymShCCurrent;
        boolean oldMinInitialSymShCCurrentESet = minInitialSymShCCurrentESet;
        minInitialSymShCCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_INITIAL_SYM_SH_CCURRENT, oldMinInitialSymShCCurrent,
                minInitialSymShCCurrent, !oldMinInitialSymShCCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinInitialSymShCCurrent() {
        Float oldMinInitialSymShCCurrent = minInitialSymShCCurrent;
        boolean oldMinInitialSymShCCurrentESet = minInitialSymShCCurrentESet;
        minInitialSymShCCurrent = MIN_INITIAL_SYM_SH_CCURRENT_EDEFAULT;
        minInitialSymShCCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_INITIAL_SYM_SH_CCURRENT, oldMinInitialSymShCCurrent,
                MIN_INITIAL_SYM_SH_CCURRENT_EDEFAULT, oldMinInitialSymShCCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinInitialSymShCCurrent() {
        return minInitialSymShCCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinP() {
        return minP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinP( Float newMinP ) {
        Float oldMinP = minP;
        minP = newMinP;
        boolean oldMinPESet = minPESet;
        minPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_P, oldMinP, minP, !oldMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinP() {
        Float oldMinP = minP;
        boolean oldMinPESet = minPESet;
        minP = MIN_P_EDEFAULT;
        minPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_P, oldMinP, MIN_P_EDEFAULT, oldMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinP() {
        return minPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinQ() {
        return minQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinQ( Float newMinQ ) {
        Float oldMinQ = minQ;
        minQ = newMinQ;
        boolean oldMinQESet = minQESet;
        minQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Q, oldMinQ, minQ, !oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinQ() {
        Float oldMinQ = minQ;
        boolean oldMinQESet = minQESet;
        minQ = MIN_Q_EDEFAULT;
        minQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Q, oldMinQ, MIN_Q_EDEFAULT, oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinQ() {
        return minQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinR0ToX0Ratio() {
        return minR0ToX0Ratio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinR0ToX0Ratio( Float newMinR0ToX0Ratio ) {
        Float oldMinR0ToX0Ratio = minR0ToX0Ratio;
        minR0ToX0Ratio = newMinR0ToX0Ratio;
        boolean oldMinR0ToX0RatioESet = minR0ToX0RatioESet;
        minR0ToX0RatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R0_TO_X0_RATIO, oldMinR0ToX0Ratio, minR0ToX0Ratio,
                !oldMinR0ToX0RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinR0ToX0Ratio() {
        Float oldMinR0ToX0Ratio = minR0ToX0Ratio;
        boolean oldMinR0ToX0RatioESet = minR0ToX0RatioESet;
        minR0ToX0Ratio = MIN_R0_TO_X0_RATIO_EDEFAULT;
        minR0ToX0RatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R0_TO_X0_RATIO, oldMinR0ToX0Ratio,
                MIN_R0_TO_X0_RATIO_EDEFAULT, oldMinR0ToX0RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinR0ToX0Ratio() {
        return minR0ToX0RatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinR1ToX1Ratio() {
        return minR1ToX1Ratio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinR1ToX1Ratio( Float newMinR1ToX1Ratio ) {
        Float oldMinR1ToX1Ratio = minR1ToX1Ratio;
        minR1ToX1Ratio = newMinR1ToX1Ratio;
        boolean oldMinR1ToX1RatioESet = minR1ToX1RatioESet;
        minR1ToX1RatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R1_TO_X1_RATIO, oldMinR1ToX1Ratio, minR1ToX1Ratio,
                !oldMinR1ToX1RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinR1ToX1Ratio() {
        Float oldMinR1ToX1Ratio = minR1ToX1Ratio;
        boolean oldMinR1ToX1RatioESet = minR1ToX1RatioESet;
        minR1ToX1Ratio = MIN_R1_TO_X1_RATIO_EDEFAULT;
        minR1ToX1RatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R1_TO_X1_RATIO, oldMinR1ToX1Ratio,
                MIN_R1_TO_X1_RATIO_EDEFAULT, oldMinR1ToX1RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinR1ToX1Ratio() {
        return minR1ToX1RatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinZ0ToZ1Ratio() {
        return minZ0ToZ1Ratio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinZ0ToZ1Ratio( Float newMinZ0ToZ1Ratio ) {
        Float oldMinZ0ToZ1Ratio = minZ0ToZ1Ratio;
        minZ0ToZ1Ratio = newMinZ0ToZ1Ratio;
        boolean oldMinZ0ToZ1RatioESet = minZ0ToZ1RatioESet;
        minZ0ToZ1RatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Z0_TO_Z1_RATIO, oldMinZ0ToZ1Ratio, minZ0ToZ1Ratio,
                !oldMinZ0ToZ1RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinZ0ToZ1Ratio() {
        Float oldMinZ0ToZ1Ratio = minZ0ToZ1Ratio;
        boolean oldMinZ0ToZ1RatioESet = minZ0ToZ1RatioESet;
        minZ0ToZ1Ratio = MIN_Z0_TO_Z1_RATIO_EDEFAULT;
        minZ0ToZ1RatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Z0_TO_Z1_RATIO, oldMinZ0ToZ1Ratio,
                MIN_Z0_TO_Z1_RATIO_EDEFAULT, oldMinZ0ToZ1RatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinZ0ToZ1Ratio() {
        return minZ0ToZ1RatioESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__P, oldP, p, !oldPESet ) );
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
                CimPackage.EXTERNAL_NETWORK_INJECTION__P, oldP, P_EDEFAULT, oldPESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__Q, oldQ, q, !oldQESet ) );
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
                CimPackage.EXTERNAL_NETWORK_INJECTION__Q, oldQ, Q_EDEFAULT, oldQESet ) );
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
    public Integer getReferencePriority() {
        return referencePriority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferencePriority( Integer newReferencePriority ) {
        Integer oldReferencePriority = referencePriority;
        referencePriority = newReferencePriority;
        boolean oldReferencePriorityESet = referencePriorityESet;
        referencePriorityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__REFERENCE_PRIORITY, oldReferencePriority, referencePriority,
                !oldReferencePriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferencePriority() {
        Integer oldReferencePriority = referencePriority;
        boolean oldReferencePriorityESet = referencePriorityESet;
        referencePriority = REFERENCE_PRIORITY_EDEFAULT;
        referencePriorityESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTERNAL_NETWORK_INJECTION__REFERENCE_PRIORITY, oldReferencePriority,
                REFERENCE_PRIORITY_EDEFAULT, oldReferencePriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferencePriority() {
        return referencePriorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVoltageFactor() {
        return voltageFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageFactor( Float newVoltageFactor ) {
        Float oldVoltageFactor = voltageFactor;
        voltageFactor = newVoltageFactor;
        boolean oldVoltageFactorESet = voltageFactorESet;
        voltageFactorESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXTERNAL_NETWORK_INJECTION__VOLTAGE_FACTOR,
                        oldVoltageFactor, voltageFactor, !oldVoltageFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageFactor() {
        Float oldVoltageFactor = voltageFactor;
        boolean oldVoltageFactorESet = voltageFactorESet;
        voltageFactor = VOLTAGE_FACTOR_EDEFAULT;
        voltageFactorESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.EXTERNAL_NETWORK_INJECTION__VOLTAGE_FACTOR,
                        oldVoltageFactor, VOLTAGE_FACTOR_EDEFAULT, oldVoltageFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageFactor() {
        return voltageFactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXTERNAL_NETWORK_INJECTION__GOVERNOR_SCD:
            return getGovernorSCD();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__IK_SECOND:
            return getIkSecond();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_INITIAL_SYM_SH_CCURRENT:
            return getMaxInitialSymShCCurrent();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_P:
            return getMaxP();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Q:
            return getMaxQ();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R0_TO_X0_RATIO:
            return getMaxR0ToX0Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R1_TO_X1_RATIO:
            return getMaxR1ToX1Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Z0_TO_Z1_RATIO:
            return getMaxZ0ToZ1Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_INITIAL_SYM_SH_CCURRENT:
            return getMinInitialSymShCCurrent();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_P:
            return getMinP();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Q:
            return getMinQ();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R0_TO_X0_RATIO:
            return getMinR0ToX0Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R1_TO_X1_RATIO:
            return getMinR1ToX1Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Z0_TO_Z1_RATIO:
            return getMinZ0ToZ1Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__P:
            return getP();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__Q:
            return getQ();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__REFERENCE_PRIORITY:
            return getReferencePriority();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__VOLTAGE_FACTOR:
            return getVoltageFactor();
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
        case CimPackage.EXTERNAL_NETWORK_INJECTION__GOVERNOR_SCD:
            setGovernorSCD( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__IK_SECOND:
            setIkSecond( ( Boolean ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_INITIAL_SYM_SH_CCURRENT:
            setMaxInitialSymShCCurrent( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_P:
            setMaxP( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Q:
            setMaxQ( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R0_TO_X0_RATIO:
            setMaxR0ToX0Ratio( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R1_TO_X1_RATIO:
            setMaxR1ToX1Ratio( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Z0_TO_Z1_RATIO:
            setMaxZ0ToZ1Ratio( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_INITIAL_SYM_SH_CCURRENT:
            setMinInitialSymShCCurrent( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_P:
            setMinP( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Q:
            setMinQ( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R0_TO_X0_RATIO:
            setMinR0ToX0Ratio( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R1_TO_X1_RATIO:
            setMinR1ToX1Ratio( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Z0_TO_Z1_RATIO:
            setMinZ0ToZ1Ratio( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__P:
            setP( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__REFERENCE_PRIORITY:
            setReferencePriority( ( Integer ) newValue );
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__VOLTAGE_FACTOR:
            setVoltageFactor( ( Float ) newValue );
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
        case CimPackage.EXTERNAL_NETWORK_INJECTION__GOVERNOR_SCD:
            unsetGovernorSCD();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__IK_SECOND:
            unsetIkSecond();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_INITIAL_SYM_SH_CCURRENT:
            unsetMaxInitialSymShCCurrent();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_P:
            unsetMaxP();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Q:
            unsetMaxQ();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R0_TO_X0_RATIO:
            unsetMaxR0ToX0Ratio();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R1_TO_X1_RATIO:
            unsetMaxR1ToX1Ratio();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Z0_TO_Z1_RATIO:
            unsetMaxZ0ToZ1Ratio();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_INITIAL_SYM_SH_CCURRENT:
            unsetMinInitialSymShCCurrent();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_P:
            unsetMinP();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Q:
            unsetMinQ();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R0_TO_X0_RATIO:
            unsetMinR0ToX0Ratio();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R1_TO_X1_RATIO:
            unsetMinR1ToX1Ratio();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Z0_TO_Z1_RATIO:
            unsetMinZ0ToZ1Ratio();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__P:
            unsetP();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__Q:
            unsetQ();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__REFERENCE_PRIORITY:
            unsetReferencePriority();
            return;
        case CimPackage.EXTERNAL_NETWORK_INJECTION__VOLTAGE_FACTOR:
            unsetVoltageFactor();
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
        case CimPackage.EXTERNAL_NETWORK_INJECTION__GOVERNOR_SCD:
            return isSetGovernorSCD();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__IK_SECOND:
            return isSetIkSecond();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_INITIAL_SYM_SH_CCURRENT:
            return isSetMaxInitialSymShCCurrent();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_P:
            return isSetMaxP();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Q:
            return isSetMaxQ();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R0_TO_X0_RATIO:
            return isSetMaxR0ToX0Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R1_TO_X1_RATIO:
            return isSetMaxR1ToX1Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Z0_TO_Z1_RATIO:
            return isSetMaxZ0ToZ1Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_INITIAL_SYM_SH_CCURRENT:
            return isSetMinInitialSymShCCurrent();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_P:
            return isSetMinP();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Q:
            return isSetMinQ();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R0_TO_X0_RATIO:
            return isSetMinR0ToX0Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R1_TO_X1_RATIO:
            return isSetMinR1ToX1Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Z0_TO_Z1_RATIO:
            return isSetMinZ0ToZ1Ratio();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__P:
            return isSetP();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__Q:
            return isSetQ();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__REFERENCE_PRIORITY:
            return isSetReferencePriority();
        case CimPackage.EXTERNAL_NETWORK_INJECTION__VOLTAGE_FACTOR:
            return isSetVoltageFactor();
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
        result.append( " (governorSCD: " );
        if( governorSCDESet )
            result.append( governorSCD );
        else
            result.append( "<unset>" );
        result.append( ", ikSecond: " );
        if( ikSecondESet )
            result.append( ikSecond );
        else
            result.append( "<unset>" );
        result.append( ", maxInitialSymShCCurrent: " );
        if( maxInitialSymShCCurrentESet )
            result.append( maxInitialSymShCCurrent );
        else
            result.append( "<unset>" );
        result.append( ", maxP: " );
        if( maxPESet )
            result.append( maxP );
        else
            result.append( "<unset>" );
        result.append( ", maxQ: " );
        if( maxQESet )
            result.append( maxQ );
        else
            result.append( "<unset>" );
        result.append( ", maxR0ToX0Ratio: " );
        if( maxR0ToX0RatioESet )
            result.append( maxR0ToX0Ratio );
        else
            result.append( "<unset>" );
        result.append( ", maxR1ToX1Ratio: " );
        if( maxR1ToX1RatioESet )
            result.append( maxR1ToX1Ratio );
        else
            result.append( "<unset>" );
        result.append( ", maxZ0ToZ1Ratio: " );
        if( maxZ0ToZ1RatioESet )
            result.append( maxZ0ToZ1Ratio );
        else
            result.append( "<unset>" );
        result.append( ", minInitialSymShCCurrent: " );
        if( minInitialSymShCCurrentESet )
            result.append( minInitialSymShCCurrent );
        else
            result.append( "<unset>" );
        result.append( ", minP: " );
        if( minPESet )
            result.append( minP );
        else
            result.append( "<unset>" );
        result.append( ", minQ: " );
        if( minQESet )
            result.append( minQ );
        else
            result.append( "<unset>" );
        result.append( ", minR0ToX0Ratio: " );
        if( minR0ToX0RatioESet )
            result.append( minR0ToX0Ratio );
        else
            result.append( "<unset>" );
        result.append( ", minR1ToX1Ratio: " );
        if( minR1ToX1RatioESet )
            result.append( minR1ToX1Ratio );
        else
            result.append( "<unset>" );
        result.append( ", minZ0ToZ1Ratio: " );
        if( minZ0ToZ1RatioESet )
            result.append( minZ0ToZ1Ratio );
        else
            result.append( "<unset>" );
        result.append( ", p: " );
        if( pESet )
            result.append( p );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ", referencePriority: " );
        if( referencePriorityESet )
            result.append( referencePriority );
        else
            result.append( "<unset>" );
        result.append( ", voltageFactor: " );
        if( voltageFactorESet )
            result.append( voltageFactor );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExternalNetworkInjectionImpl
