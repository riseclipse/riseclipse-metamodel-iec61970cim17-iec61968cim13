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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseShuntConnectionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections;

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
 * An implementation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getAVRDelay <em>AVR Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getNomU <em>Nom U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getPhaseConnection <em>Phase Connection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getVoltageSensitivity <em>Voltage Sensitivity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorImpl#getShuntCompensatorPhase <em>Shunt Compensator Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShuntCompensatorImpl extends RegulatingCondEqImpl implements ShuntCompensator {
    /**
     * The default value of the '{@link #getAVRDelay() <em>AVR Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAVRDelay()
     * @generated
     * @ordered
     */
    protected static final Float AVR_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAVRDelay() <em>AVR Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAVRDelay()
     * @generated
     * @ordered
     */
    protected Float aVRDelay = AVR_DELAY_EDEFAULT;

    /**
     * This is true if the AVR Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aVRDelayESet;

    /**
     * The default value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected static final Boolean GROUNDED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected Boolean grounded = GROUNDED_EDEFAULT;

    /**
     * This is true if the Grounded attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundedESet;

    /**
     * The default value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumSections()
     * @generated
     * @ordered
     */
    protected static final Integer MAXIMUM_SECTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumSections()
     * @generated
     * @ordered
     */
    protected Integer maximumSections = MAXIMUM_SECTIONS_EDEFAULT;

    /**
     * This is true if the Maximum Sections attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumSectionsESet;

    /**
     * The default value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNomU()
     * @generated
     * @ordered
     */
    protected static final Float NOM_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNomU()
     * @generated
     * @ordered
     */
    protected Float nomU = NOM_U_EDEFAULT;

    /**
     * This is true if the Nom U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nomUESet;

    /**
     * The default value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalSections()
     * @generated
     * @ordered
     */
    protected static final Integer NORMAL_SECTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalSections()
     * @generated
     * @ordered
     */
    protected Integer normalSections = NORMAL_SECTIONS_EDEFAULT;

    /**
     * This is true if the Normal Sections attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalSectionsESet;

    /**
     * The default value of the '{@link #getPhaseConnection() <em>Phase Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseConnection()
     * @generated
     * @ordered
     */
    protected static final PhaseShuntConnectionKind PHASE_CONNECTION_EDEFAULT = PhaseShuntConnectionKind.D;

    /**
     * The cached value of the '{@link #getPhaseConnection() <em>Phase Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseConnection()
     * @generated
     * @ordered
     */
    protected PhaseShuntConnectionKind phaseConnection = PHASE_CONNECTION_EDEFAULT;

    /**
     * This is true if the Phase Connection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseConnectionESet;

    /**
     * The default value of the '{@link #getSections() <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSections()
     * @generated
     * @ordered
     */
    protected static final Float SECTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSections() <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSections()
     * @generated
     * @ordered
     */
    protected Float sections = SECTIONS_EDEFAULT;

    /**
     * This is true if the Sections attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sectionsESet;

    /**
     * The default value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchOnCount()
     * @generated
     * @ordered
     */
    protected static final Integer SWITCH_ON_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchOnCount()
     * @generated
     * @ordered
     */
    protected Integer switchOnCount = SWITCH_ON_COUNT_EDEFAULT;

    /**
     * This is true if the Switch On Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchOnCountESet;

    /**
     * The default value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchOnDate()
     * @generated
     * @ordered
     */
    protected static final Date SWITCH_ON_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchOnDate()
     * @generated
     * @ordered
     */
    protected Date switchOnDate = SWITCH_ON_DATE_EDEFAULT;

    /**
     * This is true if the Switch On Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchOnDateESet;

    /**
     * The default value of the '{@link #getVoltageSensitivity() <em>Voltage Sensitivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageSensitivity()
     * @generated
     * @ordered
     */
    protected static final Float VOLTAGE_SENSITIVITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageSensitivity() <em>Voltage Sensitivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageSensitivity()
     * @generated
     * @ordered
     */
    protected Float voltageSensitivity = VOLTAGE_SENSITIVITY_EDEFAULT;

    /**
     * This is true if the Voltage Sensitivity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageSensitivityESet;

    /**
     * The cached value of the '{@link #getSvShuntCompensatorSections() <em>Sv Shunt Compensator Sections</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvShuntCompensatorSections()
     * @generated
     * @ordered
     */
    protected SvShuntCompensatorSections svShuntCompensatorSections;

    /**
     * This is true if the Sv Shunt Compensator Sections reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svShuntCompensatorSectionsESet;

    /**
     * The cached value of the '{@link #getShuntCompensatorPhase() <em>Shunt Compensator Phase</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShuntCompensatorPhase()
     * @generated
     * @ordered
     */
    protected EList< ShuntCompensatorPhase > shuntCompensatorPhase;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShuntCompensatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getShuntCompensator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAVRDelay() {
        return aVRDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAVRDelay( Float newAVRDelay ) {
        Float oldAVRDelay = aVRDelay;
        aVRDelay = newAVRDelay;
        boolean oldAVRDelayESet = aVRDelayESet;
        aVRDelayESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHUNT_COMPENSATOR__AVR_DELAY, oldAVRDelay, aVRDelay, !oldAVRDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAVRDelay() {
        Float oldAVRDelay = aVRDelay;
        boolean oldAVRDelayESet = aVRDelayESet;
        aVRDelay = AVR_DELAY_EDEFAULT;
        aVRDelayESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHUNT_COMPENSATOR__AVR_DELAY, oldAVRDelay, AVR_DELAY_EDEFAULT, oldAVRDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAVRDelay() {
        return aVRDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGrounded() {
        return grounded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGrounded( Boolean newGrounded ) {
        Boolean oldGrounded = grounded;
        grounded = newGrounded;
        boolean oldGroundedESet = groundedESet;
        groundedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHUNT_COMPENSATOR__GROUNDED, oldGrounded, grounded, !oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGrounded() {
        Boolean oldGrounded = grounded;
        boolean oldGroundedESet = groundedESet;
        grounded = GROUNDED_EDEFAULT;
        groundedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHUNT_COMPENSATOR__GROUNDED, oldGrounded, GROUNDED_EDEFAULT, oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGrounded() {
        return groundedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaximumSections() {
        return maximumSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximumSections( Integer newMaximumSections ) {
        Integer oldMaximumSections = maximumSections;
        maximumSections = newMaximumSections;
        boolean oldMaximumSectionsESet = maximumSectionsESet;
        maximumSectionsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS,
                    oldMaximumSections, maximumSections, !oldMaximumSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaximumSections() {
        Integer oldMaximumSections = maximumSections;
        boolean oldMaximumSectionsESet = maximumSectionsESet;
        maximumSections = MAXIMUM_SECTIONS_EDEFAULT;
        maximumSectionsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS,
                    oldMaximumSections, MAXIMUM_SECTIONS_EDEFAULT, oldMaximumSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaximumSections() {
        return maximumSectionsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNomU() {
        return nomU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNomU( Float newNomU ) {
        Float oldNomU = nomU;
        nomU = newNomU;
        boolean oldNomUESet = nomUESet;
        nomUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHUNT_COMPENSATOR__NOM_U, oldNomU, nomU, !oldNomUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNomU() {
        Float oldNomU = nomU;
        boolean oldNomUESet = nomUESet;
        nomU = NOM_U_EDEFAULT;
        nomUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHUNT_COMPENSATOR__NOM_U, oldNomU, NOM_U_EDEFAULT, oldNomUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNomU() {
        return nomUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNormalSections() {
        return normalSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalSections( Integer newNormalSections ) {
        Integer oldNormalSections = normalSections;
        normalSections = newNormalSections;
        boolean oldNormalSectionsESet = normalSectionsESet;
        normalSectionsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS,
                    oldNormalSections, normalSections, !oldNormalSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalSections() {
        Integer oldNormalSections = normalSections;
        boolean oldNormalSectionsESet = normalSectionsESet;
        normalSections = NORMAL_SECTIONS_EDEFAULT;
        normalSectionsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS,
                    oldNormalSections, NORMAL_SECTIONS_EDEFAULT, oldNormalSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalSections() {
        return normalSectionsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseShuntConnectionKind getPhaseConnection() {
        return phaseConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseConnection( PhaseShuntConnectionKind newPhaseConnection ) {
        PhaseShuntConnectionKind oldPhaseConnection = phaseConnection;
        phaseConnection = newPhaseConnection == null ? PHASE_CONNECTION_EDEFAULT : newPhaseConnection;
        boolean oldPhaseConnectionESet = phaseConnectionESet;
        phaseConnectionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__PHASE_CONNECTION,
                    oldPhaseConnection, phaseConnection, !oldPhaseConnectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseConnection() {
        PhaseShuntConnectionKind oldPhaseConnection = phaseConnection;
        boolean oldPhaseConnectionESet = phaseConnectionESet;
        phaseConnection = PHASE_CONNECTION_EDEFAULT;
        phaseConnectionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__PHASE_CONNECTION,
                    oldPhaseConnection, PHASE_CONNECTION_EDEFAULT, oldPhaseConnectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseConnection() {
        return phaseConnectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSections() {
        return sections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSections( Float newSections ) {
        Float oldSections = sections;
        sections = newSections;
        boolean oldSectionsESet = sectionsESet;
        sectionsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHUNT_COMPENSATOR__SECTIONS, oldSections, sections, !oldSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSections() {
        Float oldSections = sections;
        boolean oldSectionsESet = sectionsESet;
        sections = SECTIONS_EDEFAULT;
        sectionsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHUNT_COMPENSATOR__SECTIONS, oldSections, SECTIONS_EDEFAULT, oldSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSections() {
        return sectionsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSwitchOnCount() {
        return switchOnCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSwitchOnCount( Integer newSwitchOnCount ) {
        Integer oldSwitchOnCount = switchOnCount;
        switchOnCount = newSwitchOnCount;
        boolean oldSwitchOnCountESet = switchOnCountESet;
        switchOnCountESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT,
                    oldSwitchOnCount, switchOnCount, !oldSwitchOnCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchOnCount() {
        Integer oldSwitchOnCount = switchOnCount;
        boolean oldSwitchOnCountESet = switchOnCountESet;
        switchOnCount = SWITCH_ON_COUNT_EDEFAULT;
        switchOnCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT,
                    oldSwitchOnCount, SWITCH_ON_COUNT_EDEFAULT, oldSwitchOnCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchOnCount() {
        return switchOnCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getSwitchOnDate() {
        return switchOnDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSwitchOnDate( Date newSwitchOnDate ) {
        Date oldSwitchOnDate = switchOnDate;
        switchOnDate = newSwitchOnDate;
        boolean oldSwitchOnDateESet = switchOnDateESet;
        switchOnDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE, oldSwitchOnDate, switchOnDate, !oldSwitchOnDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchOnDate() {
        Date oldSwitchOnDate = switchOnDate;
        boolean oldSwitchOnDateESet = switchOnDateESet;
        switchOnDate = SWITCH_ON_DATE_EDEFAULT;
        switchOnDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE,
                    oldSwitchOnDate, SWITCH_ON_DATE_EDEFAULT, oldSwitchOnDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchOnDate() {
        return switchOnDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVoltageSensitivity() {
        return voltageSensitivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageSensitivity( Float newVoltageSensitivity ) {
        Float oldVoltageSensitivity = voltageSensitivity;
        voltageSensitivity = newVoltageSensitivity;
        boolean oldVoltageSensitivityESet = voltageSensitivityESet;
        voltageSensitivityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY,
                    oldVoltageSensitivity, voltageSensitivity, !oldVoltageSensitivityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageSensitivity() {
        Float oldVoltageSensitivity = voltageSensitivity;
        boolean oldVoltageSensitivityESet = voltageSensitivityESet;
        voltageSensitivity = VOLTAGE_SENSITIVITY_EDEFAULT;
        voltageSensitivityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY,
                    oldVoltageSensitivity, VOLTAGE_SENSITIVITY_EDEFAULT, oldVoltageSensitivityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageSensitivity() {
        return voltageSensitivityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvShuntCompensatorSections getSvShuntCompensatorSections() {
        if( svShuntCompensatorSections != null && svShuntCompensatorSections.eIsProxy() ) {
            InternalEObject oldSvShuntCompensatorSections = ( InternalEObject ) svShuntCompensatorSections;
            svShuntCompensatorSections = ( SvShuntCompensatorSections ) eResolveProxy( oldSvShuntCompensatorSections );
            if( svShuntCompensatorSections != oldSvShuntCompensatorSections ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, oldSvShuntCompensatorSections,
                        svShuntCompensatorSections ) );
            }
        }
        return svShuntCompensatorSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SvShuntCompensatorSections basicGetSvShuntCompensatorSections() {
        return svShuntCompensatorSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSvShuntCompensatorSections(
            SvShuntCompensatorSections newSvShuntCompensatorSections, NotificationChain msgs ) {
        SvShuntCompensatorSections oldSvShuntCompensatorSections = svShuntCompensatorSections;
        svShuntCompensatorSections = newSvShuntCompensatorSections;
        boolean oldSvShuntCompensatorSectionsESet = svShuntCompensatorSectionsESet;
        svShuntCompensatorSectionsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, oldSvShuntCompensatorSections,
                    newSvShuntCompensatorSections, !oldSvShuntCompensatorSectionsESet );
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
    public void setSvShuntCompensatorSections( SvShuntCompensatorSections newSvShuntCompensatorSections ) {
        if( newSvShuntCompensatorSections != svShuntCompensatorSections ) {
            NotificationChain msgs = null;
            if( svShuntCompensatorSections != null )
                msgs = ( ( InternalEObject ) svShuntCompensatorSections ).eInverseRemove( this,
                        CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class,
                        msgs );
            if( newSvShuntCompensatorSections != null )
                msgs = ( ( InternalEObject ) newSvShuntCompensatorSections ).eInverseAdd( this,
                        CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class,
                        msgs );
            msgs = basicSetSvShuntCompensatorSections( newSvShuntCompensatorSections, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvShuntCompensatorSectionsESet = svShuntCompensatorSectionsESet;
            svShuntCompensatorSectionsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, newSvShuntCompensatorSections,
                    newSvShuntCompensatorSections, !oldSvShuntCompensatorSectionsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSvShuntCompensatorSections( NotificationChain msgs ) {
        SvShuntCompensatorSections oldSvShuntCompensatorSections = svShuntCompensatorSections;
        svShuntCompensatorSections = null;
        boolean oldSvShuntCompensatorSectionsESet = svShuntCompensatorSectionsESet;
        svShuntCompensatorSectionsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, oldSvShuntCompensatorSections, null,
                    oldSvShuntCompensatorSectionsESet );
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
    public void unsetSvShuntCompensatorSections() {
        if( svShuntCompensatorSections != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) svShuntCompensatorSections ).eInverseRemove( this,
                    CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class,
                    msgs );
            msgs = basicUnsetSvShuntCompensatorSections( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvShuntCompensatorSectionsESet = svShuntCompensatorSectionsESet;
            svShuntCompensatorSectionsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, null, null,
                    oldSvShuntCompensatorSectionsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvShuntCompensatorSections() {
        return svShuntCompensatorSectionsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ShuntCompensatorPhase > getShuntCompensatorPhase() {
        if( shuntCompensatorPhase == null ) {
            shuntCompensatorPhase = new EObjectWithInverseResolvingEList.Unsettable< ShuntCompensatorPhase >(
                    ShuntCompensatorPhase.class, this, CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE,
                    CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR );
        }
        return shuntCompensatorPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShuntCompensatorPhase() {
        if( shuntCompensatorPhase != null ) ( ( InternalEList.Unsettable< ? > ) shuntCompensatorPhase ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShuntCompensatorPhase() {
        return shuntCompensatorPhase != null && ( ( InternalEList.Unsettable< ? > ) shuntCompensatorPhase ).isSet();
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
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            if( svShuntCompensatorSections != null )
                msgs = ( ( InternalEObject ) svShuntCompensatorSections ).eInverseRemove( this,
                        CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class,
                        msgs );
            return basicSetSvShuntCompensatorSections( ( SvShuntCompensatorSections ) otherEnd, msgs );
        case CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getShuntCompensatorPhase() )
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
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            return basicUnsetSvShuntCompensatorSections( msgs );
        case CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE:
            return ( ( InternalEList< ? > ) getShuntCompensatorPhase() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
            return getAVRDelay();
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
            return getGrounded();
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
            return getMaximumSections();
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
            return getNomU();
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
            return getNormalSections();
        case CimPackage.SHUNT_COMPENSATOR__PHASE_CONNECTION:
            return getPhaseConnection();
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
            return getSections();
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
            return getSwitchOnCount();
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
            return getSwitchOnDate();
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
            return getVoltageSensitivity();
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            if( resolve ) return getSvShuntCompensatorSections();
            return basicGetSvShuntCompensatorSections();
        case CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE:
            return getShuntCompensatorPhase();
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
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
            setAVRDelay( ( Float ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
            setGrounded( ( Boolean ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
            setMaximumSections( ( Integer ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
            setNomU( ( Float ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
            setNormalSections( ( Integer ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__PHASE_CONNECTION:
            setPhaseConnection( ( PhaseShuntConnectionKind ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
            setSections( ( Float ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
            setSwitchOnCount( ( Integer ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
            setSwitchOnDate( ( Date ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
            setVoltageSensitivity( ( Float ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            setSvShuntCompensatorSections( ( SvShuntCompensatorSections ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE:
            getShuntCompensatorPhase().clear();
            getShuntCompensatorPhase().addAll( ( Collection< ? extends ShuntCompensatorPhase > ) newValue );
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
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
            unsetAVRDelay();
            return;
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
            unsetGrounded();
            return;
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
            unsetMaximumSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
            unsetNomU();
            return;
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
            unsetNormalSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR__PHASE_CONNECTION:
            unsetPhaseConnection();
            return;
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
            unsetSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
            unsetSwitchOnCount();
            return;
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
            unsetSwitchOnDate();
            return;
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
            unsetVoltageSensitivity();
            return;
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            unsetSvShuntCompensatorSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE:
            unsetShuntCompensatorPhase();
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
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
            return isSetAVRDelay();
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
            return isSetGrounded();
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
            return isSetMaximumSections();
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
            return isSetNomU();
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
            return isSetNormalSections();
        case CimPackage.SHUNT_COMPENSATOR__PHASE_CONNECTION:
            return isSetPhaseConnection();
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
            return isSetSections();
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
            return isSetSwitchOnCount();
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
            return isSetSwitchOnDate();
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
            return isSetVoltageSensitivity();
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            return isSetSvShuntCompensatorSections();
        case CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE:
            return isSetShuntCompensatorPhase();
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
        result.append( " (aVRDelay: " );
        if( aVRDelayESet )
            result.append( aVRDelay );
        else
            result.append( "<unset>" );
        result.append( ", grounded: " );
        if( groundedESet )
            result.append( grounded );
        else
            result.append( "<unset>" );
        result.append( ", maximumSections: " );
        if( maximumSectionsESet )
            result.append( maximumSections );
        else
            result.append( "<unset>" );
        result.append( ", nomU: " );
        if( nomUESet )
            result.append( nomU );
        else
            result.append( "<unset>" );
        result.append( ", normalSections: " );
        if( normalSectionsESet )
            result.append( normalSections );
        else
            result.append( "<unset>" );
        result.append( ", phaseConnection: " );
        if( phaseConnectionESet )
            result.append( phaseConnection );
        else
            result.append( "<unset>" );
        result.append( ", sections: " );
        if( sectionsESet )
            result.append( sections );
        else
            result.append( "<unset>" );
        result.append( ", switchOnCount: " );
        if( switchOnCountESet )
            result.append( switchOnCount );
        else
            result.append( "<unset>" );
        result.append( ", switchOnDate: " );
        if( switchOnDateESet )
            result.append( switchOnDate );
        else
            result.append( "<unset>" );
        result.append( ", voltageSensitivity: " );
        if( voltageSensitivityESet )
            result.append( voltageSensitivity );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ShuntCompensatorImpl
