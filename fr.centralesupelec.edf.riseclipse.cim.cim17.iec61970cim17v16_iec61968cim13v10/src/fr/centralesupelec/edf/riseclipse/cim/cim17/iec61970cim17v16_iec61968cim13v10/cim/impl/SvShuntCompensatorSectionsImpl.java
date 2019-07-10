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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Shunt Compensator Sections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SvShuntCompensatorSectionsImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SvShuntCompensatorSectionsImpl#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvShuntCompensatorSectionsImpl extends StateVariableImpl implements SvShuntCompensatorSections {
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
    protected SvShuntCompensatorSectionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSvShuntCompensatorSections();
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
                CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS, oldSections, sections, !oldSectionsESet ) );
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
                CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS, oldSections, SECTIONS_EDEFAULT, oldSectionsESet ) );
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
                    CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, oldShuntCompensator,
                    newShuntCompensator, !oldShuntCompensatorESet );
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
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs );
            if( newShuntCompensator != null ) msgs = ( ( InternalEObject ) newShuntCompensator ).eInverseAdd( this,
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs );
            msgs = basicSetShuntCompensator( newShuntCompensator, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldShuntCompensatorESet = shuntCompensatorESet;
            shuntCompensatorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, newShuntCompensator,
                    newShuntCompensator, !oldShuntCompensatorESet ) );
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
                    CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, oldShuntCompensator, null,
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
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs );
            msgs = basicUnsetShuntCompensator( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldShuntCompensatorESet = shuntCompensatorESet;
            shuntCompensatorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, null, null,
                    oldShuntCompensatorESet ) );
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
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
            if( shuntCompensator != null ) msgs = ( ( InternalEObject ) shuntCompensator ).eInverseRemove( this,
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs );
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
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
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
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
            return getSections();
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
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
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
            setSections( ( Float ) newValue );
            return;
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
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
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
            unsetSections();
            return;
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
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
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
            return isSetSections();
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
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
        result.append( " (sections: " );
        if( sectionsESet )
            result.append( sections );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SvShuntCompensatorSectionsImpl
