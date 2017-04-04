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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ElectronicAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrganisationRole;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ParentOrganization;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber;

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
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationImpl#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationImpl#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationImpl#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationImpl#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationImpl#getParentOrganisation <em>Parent Organisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationImpl extends IdentifiedObjectImpl implements Organisation {
    /**
     * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElectronicAddress()
     * @generated
     * @ordered
     */
    protected ElectronicAddress electronicAddress;

    /**
     * This is true if the Electronic Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean electronicAddressESet;

    /**
     * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhone1()
     * @generated
     * @ordered
     */
    protected TelephoneNumber phone1;

    /**
     * This is true if the Phone1 containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phone1ESet;

    /**
     * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhone2()
     * @generated
     * @ordered
     */
    protected TelephoneNumber phone2;

    /**
     * This is true if the Phone2 containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phone2ESet;

    /**
     * The cached value of the '{@link #getPostalAddress() <em>Postal Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostalAddress()
     * @generated
     * @ordered
     */
    protected StreetAddress postalAddress;

    /**
     * This is true if the Postal Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean postalAddressESet;

    /**
     * The cached value of the '{@link #getStreetAddress() <em>Street Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStreetAddress()
     * @generated
     * @ordered
     */
    protected StreetAddress streetAddress;

    /**
     * This is true if the Street Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean streetAddressESet;

    /**
     * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoles()
     * @generated
     * @ordered
     */
    protected EList< OrganisationRole > roles;

    /**
     * The cached value of the '{@link #getParentOrganisation() <em>Parent Organisation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentOrganisation()
     * @generated
     * @ordered
     */
    protected ParentOrganization parentOrganisation;

    /**
     * This is true if the Parent Organisation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean parentOrganisationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OrganisationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOrganisation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElectronicAddress getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElectronicAddress( ElectronicAddress newElectronicAddress,
            NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = newElectronicAddress;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION__ELECTRONIC_ADDRESS, oldElectronicAddress, newElectronicAddress,
                    !oldElectronicAddressESet );
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
    public void setElectronicAddress( ElectronicAddress newElectronicAddress ) {
        if( newElectronicAddress != electronicAddress ) {
            NotificationChain msgs = null;
            if( electronicAddress != null ) msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__ELECTRONIC_ADDRESS, null, msgs );
            if( newElectronicAddress != null ) msgs = ( ( InternalEObject ) newElectronicAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicSetElectronicAddress( newElectronicAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ORGANISATION__ELECTRONIC_ADDRESS,
                        newElectronicAddress, newElectronicAddress, !oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetElectronicAddress( NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = null;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__ELECTRONIC_ADDRESS, oldElectronicAddress, null, oldElectronicAddressESet );
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
    public void unsetElectronicAddress() {
        if( electronicAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicUnsetElectronicAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__ELECTRONIC_ADDRESS, null, null, oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectronicAddress() {
        return electronicAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TelephoneNumber getPhone1() {
        return phone1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhone1( TelephoneNumber newPhone1, NotificationChain msgs ) {
        TelephoneNumber oldPhone1 = phone1;
        phone1 = newPhone1;
        boolean oldPhone1ESet = phone1ESet;
        phone1ESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION__PHONE1, oldPhone1, newPhone1, !oldPhone1ESet );
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
    public void setPhone1( TelephoneNumber newPhone1 ) {
        if( newPhone1 != phone1 ) {
            NotificationChain msgs = null;
            if( phone1 != null ) msgs = ( ( InternalEObject ) phone1 ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__PHONE1, null, msgs );
            if( newPhone1 != null ) msgs = ( ( InternalEObject ) newPhone1 ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__PHONE1, null, msgs );
            msgs = basicSetPhone1( newPhone1, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhone1ESet = phone1ESet;
            phone1ESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION__PHONE1, newPhone1, newPhone1, !oldPhone1ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPhone1( NotificationChain msgs ) {
        TelephoneNumber oldPhone1 = phone1;
        phone1 = null;
        boolean oldPhone1ESet = phone1ESet;
        phone1ESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__PHONE1, oldPhone1, null, oldPhone1ESet );
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
    public void unsetPhone1() {
        if( phone1 != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) phone1 ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__PHONE1, null, msgs );
            msgs = basicUnsetPhone1( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhone1ESet = phone1ESet;
            phone1ESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__PHONE1, null, null, oldPhone1ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhone1() {
        return phone1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TelephoneNumber getPhone2() {
        return phone2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhone2( TelephoneNumber newPhone2, NotificationChain msgs ) {
        TelephoneNumber oldPhone2 = phone2;
        phone2 = newPhone2;
        boolean oldPhone2ESet = phone2ESet;
        phone2ESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION__PHONE2, oldPhone2, newPhone2, !oldPhone2ESet );
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
    public void setPhone2( TelephoneNumber newPhone2 ) {
        if( newPhone2 != phone2 ) {
            NotificationChain msgs = null;
            if( phone2 != null ) msgs = ( ( InternalEObject ) phone2 ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__PHONE2, null, msgs );
            if( newPhone2 != null ) msgs = ( ( InternalEObject ) newPhone2 ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__PHONE2, null, msgs );
            msgs = basicSetPhone2( newPhone2, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhone2ESet = phone2ESet;
            phone2ESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION__PHONE2, newPhone2, newPhone2, !oldPhone2ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPhone2( NotificationChain msgs ) {
        TelephoneNumber oldPhone2 = phone2;
        phone2 = null;
        boolean oldPhone2ESet = phone2ESet;
        phone2ESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__PHONE2, oldPhone2, null, oldPhone2ESet );
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
    public void unsetPhone2() {
        if( phone2 != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) phone2 ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__PHONE2, null, msgs );
            msgs = basicUnsetPhone2( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhone2ESet = phone2ESet;
            phone2ESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__PHONE2, null, null, oldPhone2ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhone2() {
        return phone2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPostalAddress( StreetAddress newPostalAddress, NotificationChain msgs ) {
        StreetAddress oldPostalAddress = postalAddress;
        postalAddress = newPostalAddress;
        boolean oldPostalAddressESet = postalAddressESet;
        postalAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION__POSTAL_ADDRESS, oldPostalAddress, newPostalAddress,
                    !oldPostalAddressESet );
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
    public void setPostalAddress( StreetAddress newPostalAddress ) {
        if( newPostalAddress != postalAddress ) {
            NotificationChain msgs = null;
            if( postalAddress != null ) msgs = ( ( InternalEObject ) postalAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__POSTAL_ADDRESS, null, msgs );
            if( newPostalAddress != null ) msgs = ( ( InternalEObject ) newPostalAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__POSTAL_ADDRESS, null, msgs );
            msgs = basicSetPostalAddress( newPostalAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPostalAddressESet = postalAddressESet;
            postalAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ORGANISATION__POSTAL_ADDRESS,
                        newPostalAddress, newPostalAddress, !oldPostalAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPostalAddress( NotificationChain msgs ) {
        StreetAddress oldPostalAddress = postalAddress;
        postalAddress = null;
        boolean oldPostalAddressESet = postalAddressESet;
        postalAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__POSTAL_ADDRESS, oldPostalAddress, null, oldPostalAddressESet );
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
    public void unsetPostalAddress() {
        if( postalAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) postalAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__POSTAL_ADDRESS, null, msgs );
            msgs = basicUnsetPostalAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPostalAddressESet = postalAddressESet;
            postalAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__POSTAL_ADDRESS, null, null, oldPostalAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPostalAddress() {
        return postalAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetAddress getStreetAddress() {
        return streetAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStreetAddress( StreetAddress newStreetAddress, NotificationChain msgs ) {
        StreetAddress oldStreetAddress = streetAddress;
        streetAddress = newStreetAddress;
        boolean oldStreetAddressESet = streetAddressESet;
        streetAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION__STREET_ADDRESS, oldStreetAddress, newStreetAddress,
                    !oldStreetAddressESet );
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
    public void setStreetAddress( StreetAddress newStreetAddress ) {
        if( newStreetAddress != streetAddress ) {
            NotificationChain msgs = null;
            if( streetAddress != null ) msgs = ( ( InternalEObject ) streetAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__STREET_ADDRESS, null, msgs );
            if( newStreetAddress != null ) msgs = ( ( InternalEObject ) newStreetAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__STREET_ADDRESS, null, msgs );
            msgs = basicSetStreetAddress( newStreetAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStreetAddressESet = streetAddressESet;
            streetAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ORGANISATION__STREET_ADDRESS,
                        newStreetAddress, newStreetAddress, !oldStreetAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStreetAddress( NotificationChain msgs ) {
        StreetAddress oldStreetAddress = streetAddress;
        streetAddress = null;
        boolean oldStreetAddressESet = streetAddressESet;
        streetAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__STREET_ADDRESS, oldStreetAddress, null, oldStreetAddressESet );
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
    public void unsetStreetAddress() {
        if( streetAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) streetAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ORGANISATION__STREET_ADDRESS, null, msgs );
            msgs = basicUnsetStreetAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStreetAddressESet = streetAddressESet;
            streetAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__STREET_ADDRESS, null, null, oldStreetAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStreetAddress() {
        return streetAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OrganisationRole > getRoles() {
        if( roles == null ) {
            roles = new EObjectWithInverseResolvingEList.Unsettable< OrganisationRole >( OrganisationRole.class, this,
                    CimPackage.ORGANISATION__ROLES, CimPackage.ORGANISATION_ROLE__ORGANISATION );
        }
        return roles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRoles() {
        if( roles != null ) ( ( InternalEList.Unsettable< ? > ) roles ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRoles() {
        return roles != null && ( ( InternalEList.Unsettable< ? > ) roles ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ParentOrganization getParentOrganisation() {
        return parentOrganisation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentOrganisation( ParentOrganization newParentOrganisation,
            NotificationChain msgs ) {
        ParentOrganization oldParentOrganisation = parentOrganisation;
        parentOrganisation = newParentOrganisation;
        boolean oldParentOrganisationESet = parentOrganisationESet;
        parentOrganisationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION__PARENT_ORGANISATION, oldParentOrganisation, newParentOrganisation,
                    !oldParentOrganisationESet );
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
    public void setParentOrganisation( ParentOrganization newParentOrganisation ) {
        if( newParentOrganisation != parentOrganisation ) {
            NotificationChain msgs = null;
            if( parentOrganisation != null ) msgs = ( ( InternalEObject ) parentOrganisation ).eInverseRemove( this,
                    CimPackage.PARENT_ORGANIZATION__ORGANISATION, ParentOrganization.class, msgs );
            if( newParentOrganisation != null ) msgs = ( ( InternalEObject ) newParentOrganisation ).eInverseAdd( this,
                    CimPackage.PARENT_ORGANIZATION__ORGANISATION, ParentOrganization.class, msgs );
            msgs = basicSetParentOrganisation( newParentOrganisation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldParentOrganisationESet = parentOrganisationESet;
            parentOrganisationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ORGANISATION__PARENT_ORGANISATION,
                        newParentOrganisation, newParentOrganisation, !oldParentOrganisationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetParentOrganisation( NotificationChain msgs ) {
        ParentOrganization oldParentOrganisation = parentOrganisation;
        parentOrganisation = null;
        boolean oldParentOrganisationESet = parentOrganisationESet;
        parentOrganisationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__PARENT_ORGANISATION, oldParentOrganisation, null,
                    oldParentOrganisationESet );
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
    public void unsetParentOrganisation() {
        if( parentOrganisation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) parentOrganisation ).eInverseRemove( this,
                    CimPackage.PARENT_ORGANIZATION__ORGANISATION, ParentOrganization.class, msgs );
            msgs = basicUnsetParentOrganisation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldParentOrganisationESet = parentOrganisationESet;
            parentOrganisationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION__PARENT_ORGANISATION, null, null, oldParentOrganisationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetParentOrganisation() {
        return parentOrganisationESet;
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
        case CimPackage.ORGANISATION__ROLES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRoles() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ORGANISATION__PARENT_ORGANISATION:
            if( parentOrganisation != null ) msgs = ( ( InternalEObject ) parentOrganisation ).eInverseRemove( this,
                    CimPackage.PARENT_ORGANIZATION__ORGANISATION, ParentOrganization.class, msgs );
            return basicSetParentOrganisation( ( ParentOrganization ) otherEnd, msgs );
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
        case CimPackage.ORGANISATION__ELECTRONIC_ADDRESS:
            return basicUnsetElectronicAddress( msgs );
        case CimPackage.ORGANISATION__PHONE1:
            return basicUnsetPhone1( msgs );
        case CimPackage.ORGANISATION__PHONE2:
            return basicUnsetPhone2( msgs );
        case CimPackage.ORGANISATION__POSTAL_ADDRESS:
            return basicUnsetPostalAddress( msgs );
        case CimPackage.ORGANISATION__STREET_ADDRESS:
            return basicUnsetStreetAddress( msgs );
        case CimPackage.ORGANISATION__ROLES:
            return ( ( InternalEList< ? > ) getRoles() ).basicRemove( otherEnd, msgs );
        case CimPackage.ORGANISATION__PARENT_ORGANISATION:
            return basicUnsetParentOrganisation( msgs );
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
        case CimPackage.ORGANISATION__ELECTRONIC_ADDRESS:
            return getElectronicAddress();
        case CimPackage.ORGANISATION__PHONE1:
            return getPhone1();
        case CimPackage.ORGANISATION__PHONE2:
            return getPhone2();
        case CimPackage.ORGANISATION__POSTAL_ADDRESS:
            return getPostalAddress();
        case CimPackage.ORGANISATION__STREET_ADDRESS:
            return getStreetAddress();
        case CimPackage.ORGANISATION__ROLES:
            return getRoles();
        case CimPackage.ORGANISATION__PARENT_ORGANISATION:
            return getParentOrganisation();
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
        case CimPackage.ORGANISATION__ELECTRONIC_ADDRESS:
            setElectronicAddress( ( ElectronicAddress ) newValue );
            return;
        case CimPackage.ORGANISATION__PHONE1:
            setPhone1( ( TelephoneNumber ) newValue );
            return;
        case CimPackage.ORGANISATION__PHONE2:
            setPhone2( ( TelephoneNumber ) newValue );
            return;
        case CimPackage.ORGANISATION__POSTAL_ADDRESS:
            setPostalAddress( ( StreetAddress ) newValue );
            return;
        case CimPackage.ORGANISATION__STREET_ADDRESS:
            setStreetAddress( ( StreetAddress ) newValue );
            return;
        case CimPackage.ORGANISATION__ROLES:
            getRoles().clear();
            getRoles().addAll( ( Collection< ? extends OrganisationRole > ) newValue );
            return;
        case CimPackage.ORGANISATION__PARENT_ORGANISATION:
            setParentOrganisation( ( ParentOrganization ) newValue );
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
        case CimPackage.ORGANISATION__ELECTRONIC_ADDRESS:
            unsetElectronicAddress();
            return;
        case CimPackage.ORGANISATION__PHONE1:
            unsetPhone1();
            return;
        case CimPackage.ORGANISATION__PHONE2:
            unsetPhone2();
            return;
        case CimPackage.ORGANISATION__POSTAL_ADDRESS:
            unsetPostalAddress();
            return;
        case CimPackage.ORGANISATION__STREET_ADDRESS:
            unsetStreetAddress();
            return;
        case CimPackage.ORGANISATION__ROLES:
            unsetRoles();
            return;
        case CimPackage.ORGANISATION__PARENT_ORGANISATION:
            unsetParentOrganisation();
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
        case CimPackage.ORGANISATION__ELECTRONIC_ADDRESS:
            return isSetElectronicAddress();
        case CimPackage.ORGANISATION__PHONE1:
            return isSetPhone1();
        case CimPackage.ORGANISATION__PHONE2:
            return isSetPhone2();
        case CimPackage.ORGANISATION__POSTAL_ADDRESS:
            return isSetPostalAddress();
        case CimPackage.ORGANISATION__STREET_ADDRESS:
            return isSetStreetAddress();
        case CimPackage.ORGANISATION__ROLES:
            return isSetRoles();
        case CimPackage.ORGANISATION__PARENT_ORGANISATION:
            return isSetParentOrganisation();
        }
        return super.eIsSet( featureID );
    }

} //OrganisationImpl
