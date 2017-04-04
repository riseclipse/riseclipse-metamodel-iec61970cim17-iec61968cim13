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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhase;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonlinear Shunt Compensator Phase Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NonlinearShuntCompensatorPhasePointImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NonlinearShuntCompensatorPhasePointImpl#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NonlinearShuntCompensatorPhasePointImpl#getSectionNumber <em>Section Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NonlinearShuntCompensatorPhasePointImpl#getNonlinearShuntCompensatorPhase <em>Nonlinear Shunt Compensator Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonlinearShuntCompensatorPhasePointImpl extends CimObjectWithIDImpl
        implements NonlinearShuntCompensatorPhasePoint {
    /**
     * The default value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected static final Float B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected Float b = B_EDEFAULT;

    /**
     * This is true if the B attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bESet;

    /**
     * The default value of the '{@link #getG() <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG()
     * @generated
     * @ordered
     */
    protected static final Float G_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG() <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG()
     * @generated
     * @ordered
     */
    protected Float g = G_EDEFAULT;

    /**
     * This is true if the G attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gESet;

    /**
     * The default value of the '{@link #getSectionNumber() <em>Section Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSectionNumber()
     * @generated
     * @ordered
     */
    protected static final Integer SECTION_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSectionNumber() <em>Section Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSectionNumber()
     * @generated
     * @ordered
     */
    protected Integer sectionNumber = SECTION_NUMBER_EDEFAULT;

    /**
     * This is true if the Section Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sectionNumberESet;

    /**
     * The cached value of the '{@link #getNonlinearShuntCompensatorPhase() <em>Nonlinear Shunt Compensator Phase</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNonlinearShuntCompensatorPhase()
     * @generated
     * @ordered
     */
    protected NonlinearShuntCompensatorPhase nonlinearShuntCompensatorPhase;

    /**
     * This is true if the Nonlinear Shunt Compensator Phase reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nonlinearShuntCompensatorPhaseESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NonlinearShuntCompensatorPhasePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getNonlinearShuntCompensatorPhasePoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getB() {
        return b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB( Float newB ) {
        Float oldB = b;
        b = newB;
        boolean oldBESet = bESet;
        bESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__B, oldB, b, !oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB() {
        Float oldB = b;
        boolean oldBESet = bESet;
        b = B_EDEFAULT;
        bESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__B, oldB, B_EDEFAULT, oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB() {
        return bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG() {
        return g;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG( Float newG ) {
        Float oldG = g;
        g = newG;
        boolean oldGESet = gESet;
        gESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__G, oldG, g, !oldGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG() {
        Float oldG = g;
        boolean oldGESet = gESet;
        g = G_EDEFAULT;
        gESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__G, oldG, G_EDEFAULT, oldGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG() {
        return gESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSectionNumber() {
        return sectionNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSectionNumber( Integer newSectionNumber ) {
        Integer oldSectionNumber = sectionNumber;
        sectionNumber = newSectionNumber;
        boolean oldSectionNumberESet = sectionNumberESet;
        sectionNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__SECTION_NUMBER, oldSectionNumber, sectionNumber,
                !oldSectionNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSectionNumber() {
        Integer oldSectionNumber = sectionNumber;
        boolean oldSectionNumberESet = sectionNumberESet;
        sectionNumber = SECTION_NUMBER_EDEFAULT;
        sectionNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__SECTION_NUMBER, oldSectionNumber,
                SECTION_NUMBER_EDEFAULT, oldSectionNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSectionNumber() {
        return sectionNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonlinearShuntCompensatorPhase getNonlinearShuntCompensatorPhase() {
        return nonlinearShuntCompensatorPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNonlinearShuntCompensatorPhase(
            NonlinearShuntCompensatorPhase newNonlinearShuntCompensatorPhase, NotificationChain msgs ) {
        NonlinearShuntCompensatorPhase oldNonlinearShuntCompensatorPhase = nonlinearShuntCompensatorPhase;
        nonlinearShuntCompensatorPhase = newNonlinearShuntCompensatorPhase;
        boolean oldNonlinearShuntCompensatorPhaseESet = nonlinearShuntCompensatorPhaseESet;
        nonlinearShuntCompensatorPhaseESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE,
                    oldNonlinearShuntCompensatorPhase, newNonlinearShuntCompensatorPhase,
                    !oldNonlinearShuntCompensatorPhaseESet );
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
    public void setNonlinearShuntCompensatorPhase( NonlinearShuntCompensatorPhase newNonlinearShuntCompensatorPhase ) {
        if( newNonlinearShuntCompensatorPhase != nonlinearShuntCompensatorPhase ) {
            NotificationChain msgs = null;
            if( nonlinearShuntCompensatorPhase != null )
                msgs = ( ( InternalEObject ) nonlinearShuntCompensatorPhase ).eInverseRemove( this,
                        CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS,
                        NonlinearShuntCompensatorPhase.class, msgs );
            if( newNonlinearShuntCompensatorPhase != null )
                msgs = ( ( InternalEObject ) newNonlinearShuntCompensatorPhase ).eInverseAdd( this,
                        CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS,
                        NonlinearShuntCompensatorPhase.class, msgs );
            msgs = basicSetNonlinearShuntCompensatorPhase( newNonlinearShuntCompensatorPhase, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNonlinearShuntCompensatorPhaseESet = nonlinearShuntCompensatorPhaseESet;
            nonlinearShuntCompensatorPhaseESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE,
                    newNonlinearShuntCompensatorPhase, newNonlinearShuntCompensatorPhase,
                    !oldNonlinearShuntCompensatorPhaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNonlinearShuntCompensatorPhase( NotificationChain msgs ) {
        NonlinearShuntCompensatorPhase oldNonlinearShuntCompensatorPhase = nonlinearShuntCompensatorPhase;
        nonlinearShuntCompensatorPhase = null;
        boolean oldNonlinearShuntCompensatorPhaseESet = nonlinearShuntCompensatorPhaseESet;
        nonlinearShuntCompensatorPhaseESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE,
                    oldNonlinearShuntCompensatorPhase, null, oldNonlinearShuntCompensatorPhaseESet );
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
    public void unsetNonlinearShuntCompensatorPhase() {
        if( nonlinearShuntCompensatorPhase != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) nonlinearShuntCompensatorPhase ).eInverseRemove( this,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS,
                    NonlinearShuntCompensatorPhase.class, msgs );
            msgs = basicUnsetNonlinearShuntCompensatorPhase( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNonlinearShuntCompensatorPhaseESet = nonlinearShuntCompensatorPhaseESet;
            nonlinearShuntCompensatorPhaseESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE, null, null,
                    oldNonlinearShuntCompensatorPhaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNonlinearShuntCompensatorPhase() {
        return nonlinearShuntCompensatorPhaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE:
            if( nonlinearShuntCompensatorPhase != null )
                msgs = ( ( InternalEObject ) nonlinearShuntCompensatorPhase ).eInverseRemove( this,
                        CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS,
                        NonlinearShuntCompensatorPhase.class, msgs );
            return basicSetNonlinearShuntCompensatorPhase( ( NonlinearShuntCompensatorPhase ) otherEnd, msgs );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE:
            return basicUnsetNonlinearShuntCompensatorPhase( msgs );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__B:
            return getB();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__G:
            return getG();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__SECTION_NUMBER:
            return getSectionNumber();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE:
            return getNonlinearShuntCompensatorPhase();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__B:
            setB( ( Float ) newValue );
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__G:
            setG( ( Float ) newValue );
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__SECTION_NUMBER:
            setSectionNumber( ( Integer ) newValue );
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE:
            setNonlinearShuntCompensatorPhase( ( NonlinearShuntCompensatorPhase ) newValue );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__B:
            unsetB();
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__G:
            unsetG();
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__SECTION_NUMBER:
            unsetSectionNumber();
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE:
            unsetNonlinearShuntCompensatorPhase();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__B:
            return isSetB();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__G:
            return isSetG();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__SECTION_NUMBER:
            return isSetSectionNumber();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE:
            return isSetNonlinearShuntCompensatorPhase();
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
        result.append( " (b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", g: " );
        if( gESet )
            result.append( g );
        else
            result.append( "<unset>" );
        result.append( ", sectionNumber: " );
        if( sectionNumberESet )
            result.append( sectionNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //NonlinearShuntCompensatorPhasePointImpl
