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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shunt Compensator Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorPhaseImpl#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorPhaseImpl#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorPhaseImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorPhaseImpl#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShuntCompensatorPhaseImpl extends PowerSystemResourceImpl implements ShuntCompensatorPhase {
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
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind PHASE_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind phase = PHASE_EDEFAULT;

    /**
     * This is true if the Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseESet;

    /**
     * The cached value of the '{@link #getShuntCompensator() <em>Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShuntCompensator()
     * @generated
     * @ordered
     */
    protected ShuntCompensator shuntCompensator;

    /**
     * This is true if the Shunt Compensator reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shuntCompensatorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShuntCompensatorPhaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getShuntCompensatorPhase();
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR_PHASE__MAXIMUM_SECTIONS,
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR_PHASE__MAXIMUM_SECTIONS,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR_PHASE__NORMAL_SECTIONS,
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR_PHASE__NORMAL_SECTIONS,
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
    public SinglePhaseKind getPhase() {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhase( SinglePhaseKind newPhase ) {
        SinglePhaseKind oldPhase = phase;
        phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
        boolean oldPhaseESet = phaseESet;
        phaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHUNT_COMPENSATOR_PHASE__PHASE, oldPhase, phase, !oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhase() {
        SinglePhaseKind oldPhase = phase;
        boolean oldPhaseESet = phaseESet;
        phase = PHASE_EDEFAULT;
        phaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHUNT_COMPENSATOR_PHASE__PHASE, oldPhase, PHASE_EDEFAULT, oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhase() {
        return phaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShuntCompensator getShuntCompensator() {
        return shuntCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetShuntCompensator( ShuntCompensator newShuntCompensator, NotificationChain msgs ) {
        ShuntCompensator oldShuntCompensator = shuntCompensator;
        shuntCompensator = newShuntCompensator;
        boolean oldShuntCompensatorESet = shuntCompensatorESet;
        shuntCompensatorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR, oldShuntCompensator, newShuntCompensator,
                    !oldShuntCompensatorESet );
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
    public void setShuntCompensator( ShuntCompensator newShuntCompensator ) {
        if( newShuntCompensator != shuntCompensator ) {
            NotificationChain msgs = null;
            if( shuntCompensator != null ) msgs = ( ( InternalEObject ) shuntCompensator ).eInverseRemove( this,
                    CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE, ShuntCompensator.class, msgs );
            if( newShuntCompensator != null ) msgs = ( ( InternalEObject ) newShuntCompensator ).eInverseAdd( this,
                    CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE, ShuntCompensator.class, msgs );
            msgs = basicSetShuntCompensator( newShuntCompensator, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldShuntCompensatorESet = shuntCompensatorESet;
            shuntCompensatorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR, newShuntCompensator, newShuntCompensator,
                    !oldShuntCompensatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetShuntCompensator( NotificationChain msgs ) {
        ShuntCompensator oldShuntCompensator = shuntCompensator;
        shuntCompensator = null;
        boolean oldShuntCompensatorESet = shuntCompensatorESet;
        shuntCompensatorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR, oldShuntCompensator, null,
                    oldShuntCompensatorESet );
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
    public void unsetShuntCompensator() {
        if( shuntCompensator != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) shuntCompensator ).eInverseRemove( this,
                    CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE, ShuntCompensator.class, msgs );
            msgs = basicUnsetShuntCompensator( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldShuntCompensatorESet = shuntCompensatorESet;
            shuntCompensatorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR, null, null, oldShuntCompensatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShuntCompensator() {
        return shuntCompensatorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
            if( shuntCompensator != null ) msgs = ( ( InternalEObject ) shuntCompensator ).eInverseRemove( this,
                    CimPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASE, ShuntCompensator.class, msgs );
            return basicSetShuntCompensator( ( ShuntCompensator ) otherEnd, msgs );
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
        case CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
            return basicUnsetShuntCompensator( msgs );
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
        case CimPackage.SHUNT_COMPENSATOR_PHASE__MAXIMUM_SECTIONS:
            return getMaximumSections();
        case CimPackage.SHUNT_COMPENSATOR_PHASE__NORMAL_SECTIONS:
            return getNormalSections();
        case CimPackage.SHUNT_COMPENSATOR_PHASE__PHASE:
            return getPhase();
        case CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
            return getShuntCompensator();
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
        case CimPackage.SHUNT_COMPENSATOR_PHASE__MAXIMUM_SECTIONS:
            setMaximumSections( ( Integer ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR_PHASE__NORMAL_SECTIONS:
            setNormalSections( ( Integer ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR_PHASE__PHASE:
            setPhase( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
            setShuntCompensator( ( ShuntCompensator ) newValue );
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
        case CimPackage.SHUNT_COMPENSATOR_PHASE__MAXIMUM_SECTIONS:
            unsetMaximumSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR_PHASE__NORMAL_SECTIONS:
            unsetNormalSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR_PHASE__PHASE:
            unsetPhase();
            return;
        case CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
            unsetShuntCompensator();
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
        case CimPackage.SHUNT_COMPENSATOR_PHASE__MAXIMUM_SECTIONS:
            return isSetMaximumSections();
        case CimPackage.SHUNT_COMPENSATOR_PHASE__NORMAL_SECTIONS:
            return isSetNormalSections();
        case CimPackage.SHUNT_COMPENSATOR_PHASE__PHASE:
            return isSetPhase();
        case CimPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
            return isSetShuntCompensator();
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
        result.append( " (maximumSections: " );
        if( maximumSectionsESet )
            result.append( maximumSections );
        else
            result.append( "<unset>" );
        result.append( ", normalSections: " );
        if( normalSectionsESet )
            result.append( normalSections );
        else
            result.append( "<unset>" );
        result.append( ", phase: " );
        if( phaseESet )
            result.append( phase );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ShuntCompensatorPhaseImpl
