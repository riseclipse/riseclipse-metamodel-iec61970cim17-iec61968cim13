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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC2A;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disc Exc Cont IEEEDEC2A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC2AImpl#getTd1 <em>Td1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC2AImpl#getTd2 <em>Td2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC2AImpl#getVdmax <em>Vdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC2AImpl#getVdmin <em>Vdmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC2AImpl#getVk <em>Vk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscExcContIEEEDEC2AImpl extends DiscontinuousExcitationControlDynamicsImpl
        implements DiscExcContIEEEDEC2A {
    /**
     * The default value of the '{@link #getTd1() <em>Td1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd1()
     * @generated
     * @ordered
     */
    protected static final Float TD1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTd1() <em>Td1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd1()
     * @generated
     * @ordered
     */
    protected Float td1 = TD1_EDEFAULT;

    /**
     * This is true if the Td1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean td1ESet;

    /**
     * The default value of the '{@link #getTd2() <em>Td2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd2()
     * @generated
     * @ordered
     */
    protected static final Float TD2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTd2() <em>Td2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd2()
     * @generated
     * @ordered
     */
    protected Float td2 = TD2_EDEFAULT;

    /**
     * This is true if the Td2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean td2ESet;

    /**
     * The default value of the '{@link #getVdmax() <em>Vdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVdmax()
     * @generated
     * @ordered
     */
    protected static final Float VDMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVdmax() <em>Vdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVdmax()
     * @generated
     * @ordered
     */
    protected Float vdmax = VDMAX_EDEFAULT;

    /**
     * This is true if the Vdmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vdmaxESet;

    /**
     * The default value of the '{@link #getVdmin() <em>Vdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVdmin()
     * @generated
     * @ordered
     */
    protected static final Float VDMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVdmin() <em>Vdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVdmin()
     * @generated
     * @ordered
     */
    protected Float vdmin = VDMIN_EDEFAULT;

    /**
     * This is true if the Vdmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vdminESet;

    /**
     * The default value of the '{@link #getVk() <em>Vk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVk()
     * @generated
     * @ordered
     */
    protected static final Float VK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVk() <em>Vk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVk()
     * @generated
     * @ordered
     */
    protected Float vk = VK_EDEFAULT;

    /**
     * This is true if the Vk attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vkESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiscExcContIEEEDEC2AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiscExcContIEEEDEC2A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTd1() {
        return td1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTd1( Float newTd1 ) {
        Float oldTd1 = td1;
        td1 = newTd1;
        boolean oldTd1ESet = td1ESet;
        td1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD1, oldTd1, td1, !oldTd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTd1() {
        Float oldTd1 = td1;
        boolean oldTd1ESet = td1ESet;
        td1 = TD1_EDEFAULT;
        td1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD1, oldTd1, TD1_EDEFAULT, oldTd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTd1() {
        return td1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTd2() {
        return td2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTd2( Float newTd2 ) {
        Float oldTd2 = td2;
        td2 = newTd2;
        boolean oldTd2ESet = td2ESet;
        td2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD2, oldTd2, td2, !oldTd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTd2() {
        Float oldTd2 = td2;
        boolean oldTd2ESet = td2ESet;
        td2 = TD2_EDEFAULT;
        td2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD2, oldTd2, TD2_EDEFAULT, oldTd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTd2() {
        return td2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVdmax() {
        return vdmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVdmax( Float newVdmax ) {
        Float oldVdmax = vdmax;
        vdmax = newVdmax;
        boolean oldVdmaxESet = vdmaxESet;
        vdmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMAX, oldVdmax, vdmax, !oldVdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVdmax() {
        Float oldVdmax = vdmax;
        boolean oldVdmaxESet = vdmaxESet;
        vdmax = VDMAX_EDEFAULT;
        vdmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMAX, oldVdmax, VDMAX_EDEFAULT, oldVdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVdmax() {
        return vdmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVdmin() {
        return vdmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVdmin( Float newVdmin ) {
        Float oldVdmin = vdmin;
        vdmin = newVdmin;
        boolean oldVdminESet = vdminESet;
        vdminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMIN, oldVdmin, vdmin, !oldVdminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVdmin() {
        Float oldVdmin = vdmin;
        boolean oldVdminESet = vdminESet;
        vdmin = VDMIN_EDEFAULT;
        vdminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMIN, oldVdmin, VDMIN_EDEFAULT, oldVdminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVdmin() {
        return vdminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVk() {
        return vk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVk( Float newVk ) {
        Float oldVk = vk;
        vk = newVk;
        boolean oldVkESet = vkESet;
        vkESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__VK, oldVk, vk, !oldVkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVk() {
        Float oldVk = vk;
        boolean oldVkESet = vkESet;
        vk = VK_EDEFAULT;
        vkESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC2A__VK, oldVk, VK_EDEFAULT, oldVkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVk() {
        return vkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD1:
            return getTd1();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD2:
            return getTd2();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMAX:
            return getVdmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMIN:
            return getVdmin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VK:
            return getVk();
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD1:
            setTd1( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD2:
            setTd2( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMAX:
            setVdmax( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMIN:
            setVdmin( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VK:
            setVk( ( Float ) newValue );
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD1:
            unsetTd1();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD2:
            unsetTd2();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMAX:
            unsetVdmax();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMIN:
            unsetVdmin();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VK:
            unsetVk();
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD1:
            return isSetTd1();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__TD2:
            return isSetTd2();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMAX:
            return isSetVdmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VDMIN:
            return isSetVdmin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A__VK:
            return isSetVk();
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
        result.append( " (td1: " );
        if( td1ESet )
            result.append( td1 );
        else
            result.append( "<unset>" );
        result.append( ", td2: " );
        if( td2ESet )
            result.append( td2 );
        else
            result.append( "<unset>" );
        result.append( ", vdmax: " );
        if( vdmaxESet )
            result.append( vdmax );
        else
            result.append( "<unset>" );
        result.append( ", vdmin: " );
        if( vdminESet )
            result.append( vdmin );
        else
            result.append( "<unset>" );
        result.append( ", vk: " );
        if( vkESet )
            result.append( vk );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiscExcContIEEEDEC2AImpl
