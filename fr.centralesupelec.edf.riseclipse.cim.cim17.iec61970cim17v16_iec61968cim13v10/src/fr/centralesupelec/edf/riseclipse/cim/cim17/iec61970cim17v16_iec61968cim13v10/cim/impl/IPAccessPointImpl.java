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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAddressKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IPAccessPointImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IPAccessPointImpl#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IPAccessPointImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IPAccessPointImpl#getSubnet <em>Subnet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPAccessPointImpl extends CommunicationLinkImpl implements IPAccessPoint {
    /**
     * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected String address = ADDRESS_EDEFAULT;

    /**
     * This is true if the Address attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean addressESet;

    /**
     * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressType()
     * @generated
     * @ordered
     */
    protected static final IPAddressKind ADDRESS_TYPE_EDEFAULT = IPAddressKind.IPV4;

    /**
     * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressType()
     * @generated
     * @ordered
     */
    protected IPAddressKind addressType = ADDRESS_TYPE_EDEFAULT;

    /**
     * This is true if the Address Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean addressTypeESet;

    /**
     * The default value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGateway()
     * @generated
     * @ordered
     */
    protected static final String GATEWAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGateway()
     * @generated
     * @ordered
     */
    protected String gateway = GATEWAY_EDEFAULT;

    /**
     * This is true if the Gateway attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gatewayESet;

    /**
     * The default value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubnet()
     * @generated
     * @ordered
     */
    protected static final String SUBNET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubnet()
     * @generated
     * @ordered
     */
    protected String subnet = SUBNET_EDEFAULT;

    /**
     * This is true if the Subnet attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subnetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IPAccessPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIPAccessPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAddress( String newAddress ) {
        String oldAddress = address;
        address = newAddress;
        boolean oldAddressESet = addressESet;
        addressESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IP_ACCESS_POINT__ADDRESS, oldAddress, address, !oldAddressESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAddress() {
        String oldAddress = address;
        boolean oldAddressESet = addressESet;
        address = ADDRESS_EDEFAULT;
        addressESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IP_ACCESS_POINT__ADDRESS, oldAddress, ADDRESS_EDEFAULT, oldAddressESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAddress() {
        return addressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IPAddressKind getAddressType() {
        return addressType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAddressType( IPAddressKind newAddressType ) {
        IPAddressKind oldAddressType = addressType;
        addressType = newAddressType == null ? ADDRESS_TYPE_EDEFAULT : newAddressType;
        boolean oldAddressTypeESet = addressTypeESet;
        addressTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IP_ACCESS_POINT__ADDRESS_TYPE, oldAddressType, addressType, !oldAddressTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAddressType() {
        IPAddressKind oldAddressType = addressType;
        boolean oldAddressTypeESet = addressTypeESet;
        addressType = ADDRESS_TYPE_EDEFAULT;
        addressTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IP_ACCESS_POINT__ADDRESS_TYPE, oldAddressType, ADDRESS_TYPE_EDEFAULT, oldAddressTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAddressType() {
        return addressTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getGateway() {
        return gateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGateway( String newGateway ) {
        String oldGateway = gateway;
        gateway = newGateway;
        boolean oldGatewayESet = gatewayESet;
        gatewayESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IP_ACCESS_POINT__GATEWAY, oldGateway, gateway, !oldGatewayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGateway() {
        String oldGateway = gateway;
        boolean oldGatewayESet = gatewayESet;
        gateway = GATEWAY_EDEFAULT;
        gatewayESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IP_ACCESS_POINT__GATEWAY, oldGateway, GATEWAY_EDEFAULT, oldGatewayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGateway() {
        return gatewayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSubnet() {
        return subnet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubnet( String newSubnet ) {
        String oldSubnet = subnet;
        subnet = newSubnet;
        boolean oldSubnetESet = subnetESet;
        subnetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IP_ACCESS_POINT__SUBNET, oldSubnet, subnet, !oldSubnetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubnet() {
        String oldSubnet = subnet;
        boolean oldSubnetESet = subnetESet;
        subnet = SUBNET_EDEFAULT;
        subnetESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IP_ACCESS_POINT__SUBNET, oldSubnet, SUBNET_EDEFAULT, oldSubnetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubnet() {
        return subnetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.IP_ACCESS_POINT__ADDRESS:
            return getAddress();
        case CimPackage.IP_ACCESS_POINT__ADDRESS_TYPE:
            return getAddressType();
        case CimPackage.IP_ACCESS_POINT__GATEWAY:
            return getGateway();
        case CimPackage.IP_ACCESS_POINT__SUBNET:
            return getSubnet();
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
        case CimPackage.IP_ACCESS_POINT__ADDRESS:
            setAddress( ( String ) newValue );
            return;
        case CimPackage.IP_ACCESS_POINT__ADDRESS_TYPE:
            setAddressType( ( IPAddressKind ) newValue );
            return;
        case CimPackage.IP_ACCESS_POINT__GATEWAY:
            setGateway( ( String ) newValue );
            return;
        case CimPackage.IP_ACCESS_POINT__SUBNET:
            setSubnet( ( String ) newValue );
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
        case CimPackage.IP_ACCESS_POINT__ADDRESS:
            unsetAddress();
            return;
        case CimPackage.IP_ACCESS_POINT__ADDRESS_TYPE:
            unsetAddressType();
            return;
        case CimPackage.IP_ACCESS_POINT__GATEWAY:
            unsetGateway();
            return;
        case CimPackage.IP_ACCESS_POINT__SUBNET:
            unsetSubnet();
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
        case CimPackage.IP_ACCESS_POINT__ADDRESS:
            return isSetAddress();
        case CimPackage.IP_ACCESS_POINT__ADDRESS_TYPE:
            return isSetAddressType();
        case CimPackage.IP_ACCESS_POINT__GATEWAY:
            return isSetGateway();
        case CimPackage.IP_ACCESS_POINT__SUBNET:
            return isSetSubnet();
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
        result.append( " (address: " );
        if( addressESet )
            result.append( address );
        else
            result.append( "<unset>" );
        result.append( ", addressType: " );
        if( addressTypeESet )
            result.append( addressType );
        else
            result.append( "<unset>" );
        result.append( ", gateway: " );
        if( gatewayESet )
            result.append( gateway );
        else
            result.append( "<unset>" );
        result.append( ", subnet: " );
        if( subnetESet )
            result.append( subnet );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //IPAccessPointImpl
