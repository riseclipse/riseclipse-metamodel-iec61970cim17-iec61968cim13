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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LinearShuntCompensatorImpl#getB0PerSection <em>B0 Per Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LinearShuntCompensatorImpl#getBPerSection <em>BPer Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LinearShuntCompensatorImpl#getG0PerSection <em>G0 Per Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LinearShuntCompensatorImpl#getGPerSection <em>GPer Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearShuntCompensatorImpl extends ShuntCompensatorImpl implements LinearShuntCompensator {
    /**
     * The default value of the '{@link #getB0PerSection() <em>B0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0PerSection()
     * @generated
     * @ordered
     */
    protected static final Float B0_PER_SECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB0PerSection() <em>B0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0PerSection()
     * @generated
     * @ordered
     */
    protected Float b0PerSection = B0_PER_SECTION_EDEFAULT;

    /**
     * This is true if the B0 Per Section attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b0PerSectionESet;

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
     * The default value of the '{@link #getG0PerSection() <em>G0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0PerSection()
     * @generated
     * @ordered
     */
    protected static final Float G0_PER_SECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG0PerSection() <em>G0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0PerSection()
     * @generated
     * @ordered
     */
    protected Float g0PerSection = G0_PER_SECTION_EDEFAULT;

    /**
     * This is true if the G0 Per Section attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g0PerSectionESet;

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
    protected LinearShuntCompensatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLinearShuntCompensator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getB0PerSection() {
        return b0PerSection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB0PerSection( Float newB0PerSection ) {
        Float oldB0PerSection = b0PerSection;
        b0PerSection = newB0PerSection;
        boolean oldB0PerSectionESet = b0PerSectionESet;
        b0PerSectionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LINEAR_SHUNT_COMPENSATOR__B0_PER_SECTION,
                    oldB0PerSection, b0PerSection, !oldB0PerSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB0PerSection() {
        Float oldB0PerSection = b0PerSection;
        boolean oldB0PerSectionESet = b0PerSectionESet;
        b0PerSection = B0_PER_SECTION_EDEFAULT;
        b0PerSectionESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.LINEAR_SHUNT_COMPENSATOR__B0_PER_SECTION,
                        oldB0PerSection, B0_PER_SECTION_EDEFAULT, oldB0PerSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB0PerSection() {
        return b0PerSectionESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LINEAR_SHUNT_COMPENSATOR__BPER_SECTION, oldBPerSection, bPerSection, !oldBPerSectionESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LINEAR_SHUNT_COMPENSATOR__BPER_SECTION,
                    oldBPerSection, BPER_SECTION_EDEFAULT, oldBPerSectionESet ) );
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
    public Float getG0PerSection() {
        return g0PerSection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG0PerSection( Float newG0PerSection ) {
        Float oldG0PerSection = g0PerSection;
        g0PerSection = newG0PerSection;
        boolean oldG0PerSectionESet = g0PerSectionESet;
        g0PerSectionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LINEAR_SHUNT_COMPENSATOR__G0_PER_SECTION,
                    oldG0PerSection, g0PerSection, !oldG0PerSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG0PerSection() {
        Float oldG0PerSection = g0PerSection;
        boolean oldG0PerSectionESet = g0PerSectionESet;
        g0PerSection = G0_PER_SECTION_EDEFAULT;
        g0PerSectionESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.LINEAR_SHUNT_COMPENSATOR__G0_PER_SECTION,
                        oldG0PerSection, G0_PER_SECTION_EDEFAULT, oldG0PerSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG0PerSection() {
        return g0PerSectionESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LINEAR_SHUNT_COMPENSATOR__GPER_SECTION, oldGPerSection, gPerSection, !oldGPerSectionESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LINEAR_SHUNT_COMPENSATOR__GPER_SECTION,
                    oldGPerSection, GPER_SECTION_EDEFAULT, oldGPerSectionESet ) );
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
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__B0_PER_SECTION:
            return getB0PerSection();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__BPER_SECTION:
            return getBPerSection();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__G0_PER_SECTION:
            return getG0PerSection();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__GPER_SECTION:
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
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__B0_PER_SECTION:
            setB0PerSection( ( Float ) newValue );
            return;
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__BPER_SECTION:
            setBPerSection( ( Float ) newValue );
            return;
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__G0_PER_SECTION:
            setG0PerSection( ( Float ) newValue );
            return;
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__GPER_SECTION:
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
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__B0_PER_SECTION:
            unsetB0PerSection();
            return;
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__BPER_SECTION:
            unsetBPerSection();
            return;
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__G0_PER_SECTION:
            unsetG0PerSection();
            return;
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__GPER_SECTION:
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
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__B0_PER_SECTION:
            return isSetB0PerSection();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__BPER_SECTION:
            return isSetBPerSection();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__G0_PER_SECTION:
            return isSetG0PerSection();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR__GPER_SECTION:
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (b0PerSection: " );
        if( b0PerSectionESet )
            result.append( b0PerSection );
        else
            result.append( "<unset>" );
        result.append( ", bPerSection: " );
        if( bPerSectionESet )
            result.append( bPerSection );
        else
            result.append( "<unset>" );
        result.append( ", g0PerSection: " );
        if( g0PerSectionESet )
            result.append( g0PerSection );
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

} //LinearShuntCompensatorImpl
