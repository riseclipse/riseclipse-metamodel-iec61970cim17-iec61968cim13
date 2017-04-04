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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Shunt Compensator Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LinearShuntCompensatorPhaseImpl#getBPerSection <em>BPer Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LinearShuntCompensatorPhaseImpl#getGPerSection <em>GPer Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearShuntCompensatorPhaseImpl extends ShuntCompensatorPhaseImpl implements LinearShuntCompensatorPhase {
    /**
     * The default value of the '{@link #getBPerSection() <em>BPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBPerSection()
     * @generated
     * @ordered
     */
    protected static final Float BPER_SECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBPerSection() <em>BPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBPerSection()
     * @generated
     * @ordered
     */
    protected Float bPerSection = BPER_SECTION_EDEFAULT;

    /**
     * This is true if the BPer Section attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bPerSectionESet;

    /**
     * The default value of the '{@link #getGPerSection() <em>GPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGPerSection()
     * @generated
     * @ordered
     */
    protected static final Float GPER_SECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGPerSection() <em>GPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGPerSection()
     * @generated
     * @ordered
     */
    protected Float gPerSection = GPER_SECTION_EDEFAULT;

    /**
     * This is true if the GPer Section attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gPerSectionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinearShuntCompensatorPhaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLinearShuntCompensatorPhase();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBPerSection() {
        return bPerSection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBPerSection( Float newBPerSection ) {
        Float oldBPerSection = bPerSection;
        bPerSection = newBPerSection;
        boolean oldBPerSectionESet = bPerSectionESet;
        bPerSectionESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__BPER_SECTION,
                        oldBPerSection, bPerSection, !oldBPerSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBPerSection() {
        Float oldBPerSection = bPerSection;
        boolean oldBPerSectionESet = bPerSectionESet;
        bPerSection = BPER_SECTION_EDEFAULT;
        bPerSectionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__BPER_SECTION, oldBPerSection, BPER_SECTION_EDEFAULT,
                oldBPerSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBPerSection() {
        return bPerSectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGPerSection() {
        return gPerSection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGPerSection( Float newGPerSection ) {
        Float oldGPerSection = gPerSection;
        gPerSection = newGPerSection;
        boolean oldGPerSectionESet = gPerSectionESet;
        gPerSectionESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__GPER_SECTION,
                        oldGPerSection, gPerSection, !oldGPerSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGPerSection() {
        Float oldGPerSection = gPerSection;
        boolean oldGPerSectionESet = gPerSectionESet;
        gPerSection = GPER_SECTION_EDEFAULT;
        gPerSectionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__GPER_SECTION, oldGPerSection, GPER_SECTION_EDEFAULT,
                oldGPerSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGPerSection() {
        return gPerSectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__BPER_SECTION:
            return getBPerSection();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__GPER_SECTION:
            return getGPerSection();
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
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__BPER_SECTION:
            setBPerSection( ( Float ) newValue );
            return;
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__GPER_SECTION:
            setGPerSection( ( Float ) newValue );
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
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__BPER_SECTION:
            unsetBPerSection();
            return;
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__GPER_SECTION:
            unsetGPerSection();
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
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__BPER_SECTION:
            return isSetBPerSection();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE__GPER_SECTION:
            return isSetGPerSection();
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
        result.append( " (bPerSection: " );
        if( bPerSectionESet )
            result.append( bPerSection );
        else
            result.append( "<unset>" );
        result.append( ", gPerSection: " );
        if( gPerSectionESet )
            result.append( gPerSection );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LinearShuntCompensatorPhaseImpl
