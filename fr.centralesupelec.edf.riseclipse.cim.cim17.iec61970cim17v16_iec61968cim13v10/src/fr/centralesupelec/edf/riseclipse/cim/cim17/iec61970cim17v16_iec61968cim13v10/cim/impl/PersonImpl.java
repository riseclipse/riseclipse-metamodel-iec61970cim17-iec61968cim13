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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ElectronicAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole;
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
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getMName <em>MName</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getLandlinePhone <em>Landline Phone</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getMobilePhone <em>Mobile Phone</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends IdentifiedObjectImpl implements Person {
    /**
     * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirstName()
     * @generated
     * @ordered
     */
    protected static final String FIRST_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirstName()
     * @generated
     * @ordered
     */
    protected String firstName = FIRST_NAME_EDEFAULT;

    /**
     * This is true if the First Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean firstNameESet;

    /**
     * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastName()
     * @generated
     * @ordered
     */
    protected static final String LAST_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastName()
     * @generated
     * @ordered
     */
    protected String lastName = LAST_NAME_EDEFAULT;

    /**
     * This is true if the Last Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lastNameESet;

    /**
     * The default value of the '{@link #getMName() <em>MName</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMName()
     * @generated
     * @ordered
     */
    protected static final String MNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMName() <em>MName</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMName()
     * @generated
     * @ordered
     */
    protected String mName = MNAME_EDEFAULT;

    /**
     * This is true if the MName attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mNameESet;

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * This is true if the Prefix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prefixESet;

    /**
     * The default value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialNeed()
     * @generated
     * @ordered
     */
    protected static final String SPECIAL_NEED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialNeed()
     * @generated
     * @ordered
     */
    protected String specialNeed = SPECIAL_NEED_EDEFAULT;

    /**
     * This is true if the Special Need attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean specialNeedESet;

    /**
     * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuffix()
     * @generated
     * @ordered
     */
    protected static final String SUFFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuffix()
     * @generated
     * @ordered
     */
    protected String suffix = SUFFIX_EDEFAULT;

    /**
     * This is true if the Suffix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean suffixESet;

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
     * The cached value of the '{@link #getLandlinePhone() <em>Landline Phone</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLandlinePhone()
     * @generated
     * @ordered
     */
    protected TelephoneNumber landlinePhone;

    /**
     * This is true if the Landline Phone containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean landlinePhoneESet;

    /**
     * The cached value of the '{@link #getMobilePhone() <em>Mobile Phone</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMobilePhone()
     * @generated
     * @ordered
     */
    protected TelephoneNumber mobilePhone;

    /**
     * This is true if the Mobile Phone containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mobilePhoneESet;

    /**
     * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoles()
     * @generated
     * @ordered
     */
    protected EList< PersonRole > roles;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPerson();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFirstName( String newFirstName ) {
        String oldFirstName = firstName;
        firstName = newFirstName;
        boolean oldFirstNameESet = firstNameESet;
        firstNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PERSON__FIRST_NAME, oldFirstName, firstName, !oldFirstNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFirstName() {
        String oldFirstName = firstName;
        boolean oldFirstNameESet = firstNameESet;
        firstName = FIRST_NAME_EDEFAULT;
        firstNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PERSON__FIRST_NAME, oldFirstName, FIRST_NAME_EDEFAULT, oldFirstNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFirstName() {
        return firstNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLastName( String newLastName ) {
        String oldLastName = lastName;
        lastName = newLastName;
        boolean oldLastNameESet = lastNameESet;
        lastNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PERSON__LAST_NAME, oldLastName, lastName, !oldLastNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLastName() {
        String oldLastName = lastName;
        boolean oldLastNameESet = lastNameESet;
        lastName = LAST_NAME_EDEFAULT;
        lastNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PERSON__LAST_NAME, oldLastName, LAST_NAME_EDEFAULT, oldLastNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLastName() {
        return lastNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMName() {
        return mName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMName( String newMName ) {
        String oldMName = mName;
        mName = newMName;
        boolean oldMNameESet = mNameESet;
        mNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PERSON__MNAME,
                oldMName, mName, !oldMNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMName() {
        String oldMName = mName;
        boolean oldMNameESet = mNameESet;
        mName = MNAME_EDEFAULT;
        mNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PERSON__MNAME, oldMName, MNAME_EDEFAULT, oldMNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMName() {
        return mNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPrefix() {
        return prefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefix( String newPrefix ) {
        String oldPrefix = prefix;
        prefix = newPrefix;
        boolean oldPrefixESet = prefixESet;
        prefixESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PERSON__PREFIX,
                oldPrefix, prefix, !oldPrefixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrefix() {
        String oldPrefix = prefix;
        boolean oldPrefixESet = prefixESet;
        prefix = PREFIX_EDEFAULT;
        prefixESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PERSON__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrefix() {
        return prefixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSpecialNeed() {
        return specialNeed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecialNeed( String newSpecialNeed ) {
        String oldSpecialNeed = specialNeed;
        specialNeed = newSpecialNeed;
        boolean oldSpecialNeedESet = specialNeedESet;
        specialNeedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PERSON__SPECIAL_NEED, oldSpecialNeed, specialNeed, !oldSpecialNeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecialNeed() {
        String oldSpecialNeed = specialNeed;
        boolean oldSpecialNeedESet = specialNeedESet;
        specialNeed = SPECIAL_NEED_EDEFAULT;
        specialNeedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PERSON__SPECIAL_NEED, oldSpecialNeed, SPECIAL_NEED_EDEFAULT, oldSpecialNeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecialNeed() {
        return specialNeedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSuffix() {
        return suffix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuffix( String newSuffix ) {
        String oldSuffix = suffix;
        suffix = newSuffix;
        boolean oldSuffixESet = suffixESet;
        suffixESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PERSON__SUFFIX,
                oldSuffix, suffix, !oldSuffixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuffix() {
        String oldSuffix = suffix;
        boolean oldSuffixESet = suffixESet;
        suffix = SUFFIX_EDEFAULT;
        suffixESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PERSON__SUFFIX, oldSuffix, SUFFIX_EDEFAULT, oldSuffixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuffix() {
        return suffixESet;
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
                    CimPackage.PERSON__ELECTRONIC_ADDRESS, oldElectronicAddress, newElectronicAddress,
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__ELECTRONIC_ADDRESS, null, msgs );
            if( newElectronicAddress != null ) msgs = ( ( InternalEObject ) newElectronicAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicSetElectronicAddress( newElectronicAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PERSON__ELECTRONIC_ADDRESS,
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
                    CimPackage.PERSON__ELECTRONIC_ADDRESS, oldElectronicAddress, null, oldElectronicAddressESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicUnsetElectronicAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PERSON__ELECTRONIC_ADDRESS, null, null, oldElectronicAddressESet ) );
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
    public TelephoneNumber getLandlinePhone() {
        return landlinePhone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLandlinePhone( TelephoneNumber newLandlinePhone, NotificationChain msgs ) {
        TelephoneNumber oldLandlinePhone = landlinePhone;
        landlinePhone = newLandlinePhone;
        boolean oldLandlinePhoneESet = landlinePhoneESet;
        landlinePhoneESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PERSON__LANDLINE_PHONE, oldLandlinePhone, newLandlinePhone, !oldLandlinePhoneESet );
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
    public void setLandlinePhone( TelephoneNumber newLandlinePhone ) {
        if( newLandlinePhone != landlinePhone ) {
            NotificationChain msgs = null;
            if( landlinePhone != null ) msgs = ( ( InternalEObject ) landlinePhone ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__LANDLINE_PHONE, null, msgs );
            if( newLandlinePhone != null ) msgs = ( ( InternalEObject ) newLandlinePhone ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__LANDLINE_PHONE, null, msgs );
            msgs = basicSetLandlinePhone( newLandlinePhone, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLandlinePhoneESet = landlinePhoneESet;
            landlinePhoneESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PERSON__LANDLINE_PHONE, newLandlinePhone, newLandlinePhone, !oldLandlinePhoneESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLandlinePhone( NotificationChain msgs ) {
        TelephoneNumber oldLandlinePhone = landlinePhone;
        landlinePhone = null;
        boolean oldLandlinePhoneESet = landlinePhoneESet;
        landlinePhoneESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PERSON__LANDLINE_PHONE, oldLandlinePhone, null, oldLandlinePhoneESet );
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
    public void unsetLandlinePhone() {
        if( landlinePhone != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) landlinePhone ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__LANDLINE_PHONE, null, msgs );
            msgs = basicUnsetLandlinePhone( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLandlinePhoneESet = landlinePhoneESet;
            landlinePhoneESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PERSON__LANDLINE_PHONE, null, null, oldLandlinePhoneESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLandlinePhone() {
        return landlinePhoneESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TelephoneNumber getMobilePhone() {
        return mobilePhone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMobilePhone( TelephoneNumber newMobilePhone, NotificationChain msgs ) {
        TelephoneNumber oldMobilePhone = mobilePhone;
        mobilePhone = newMobilePhone;
        boolean oldMobilePhoneESet = mobilePhoneESet;
        mobilePhoneESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PERSON__MOBILE_PHONE, oldMobilePhone, newMobilePhone, !oldMobilePhoneESet );
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
    public void setMobilePhone( TelephoneNumber newMobilePhone ) {
        if( newMobilePhone != mobilePhone ) {
            NotificationChain msgs = null;
            if( mobilePhone != null ) msgs = ( ( InternalEObject ) mobilePhone ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__MOBILE_PHONE, null, msgs );
            if( newMobilePhone != null ) msgs = ( ( InternalEObject ) newMobilePhone ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__MOBILE_PHONE, null, msgs );
            msgs = basicSetMobilePhone( newMobilePhone, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMobilePhoneESet = mobilePhoneESet;
            mobilePhoneESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PERSON__MOBILE_PHONE, newMobilePhone, newMobilePhone, !oldMobilePhoneESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMobilePhone( NotificationChain msgs ) {
        TelephoneNumber oldMobilePhone = mobilePhone;
        mobilePhone = null;
        boolean oldMobilePhoneESet = mobilePhoneESet;
        mobilePhoneESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PERSON__MOBILE_PHONE, oldMobilePhone, null, oldMobilePhoneESet );
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
    public void unsetMobilePhone() {
        if( mobilePhone != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) mobilePhone ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PERSON__MOBILE_PHONE, null, msgs );
            msgs = basicUnsetMobilePhone( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMobilePhoneESet = mobilePhoneESet;
            mobilePhoneESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PERSON__MOBILE_PHONE, null, null, oldMobilePhoneESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMobilePhone() {
        return mobilePhoneESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PersonRole > getRoles() {
        if( roles == null ) {
            roles = new EObjectWithInverseResolvingEList.Unsettable< PersonRole >( PersonRole.class, this,
                    CimPackage.PERSON__ROLES, CimPackage.PERSON_ROLE__PERSON );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PERSON__ROLES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRoles() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.PERSON__ELECTRONIC_ADDRESS:
            return basicUnsetElectronicAddress( msgs );
        case CimPackage.PERSON__LANDLINE_PHONE:
            return basicUnsetLandlinePhone( msgs );
        case CimPackage.PERSON__MOBILE_PHONE:
            return basicUnsetMobilePhone( msgs );
        case CimPackage.PERSON__ROLES:
            return ( ( InternalEList< ? > ) getRoles() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PERSON__FIRST_NAME:
            return getFirstName();
        case CimPackage.PERSON__LAST_NAME:
            return getLastName();
        case CimPackage.PERSON__MNAME:
            return getMName();
        case CimPackage.PERSON__PREFIX:
            return getPrefix();
        case CimPackage.PERSON__SPECIAL_NEED:
            return getSpecialNeed();
        case CimPackage.PERSON__SUFFIX:
            return getSuffix();
        case CimPackage.PERSON__ELECTRONIC_ADDRESS:
            return getElectronicAddress();
        case CimPackage.PERSON__LANDLINE_PHONE:
            return getLandlinePhone();
        case CimPackage.PERSON__MOBILE_PHONE:
            return getMobilePhone();
        case CimPackage.PERSON__ROLES:
            return getRoles();
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
        case CimPackage.PERSON__FIRST_NAME:
            setFirstName( ( String ) newValue );
            return;
        case CimPackage.PERSON__LAST_NAME:
            setLastName( ( String ) newValue );
            return;
        case CimPackage.PERSON__MNAME:
            setMName( ( String ) newValue );
            return;
        case CimPackage.PERSON__PREFIX:
            setPrefix( ( String ) newValue );
            return;
        case CimPackage.PERSON__SPECIAL_NEED:
            setSpecialNeed( ( String ) newValue );
            return;
        case CimPackage.PERSON__SUFFIX:
            setSuffix( ( String ) newValue );
            return;
        case CimPackage.PERSON__ELECTRONIC_ADDRESS:
            setElectronicAddress( ( ElectronicAddress ) newValue );
            return;
        case CimPackage.PERSON__LANDLINE_PHONE:
            setLandlinePhone( ( TelephoneNumber ) newValue );
            return;
        case CimPackage.PERSON__MOBILE_PHONE:
            setMobilePhone( ( TelephoneNumber ) newValue );
            return;
        case CimPackage.PERSON__ROLES:
            getRoles().clear();
            getRoles().addAll( ( Collection< ? extends PersonRole > ) newValue );
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
        case CimPackage.PERSON__FIRST_NAME:
            unsetFirstName();
            return;
        case CimPackage.PERSON__LAST_NAME:
            unsetLastName();
            return;
        case CimPackage.PERSON__MNAME:
            unsetMName();
            return;
        case CimPackage.PERSON__PREFIX:
            unsetPrefix();
            return;
        case CimPackage.PERSON__SPECIAL_NEED:
            unsetSpecialNeed();
            return;
        case CimPackage.PERSON__SUFFIX:
            unsetSuffix();
            return;
        case CimPackage.PERSON__ELECTRONIC_ADDRESS:
            unsetElectronicAddress();
            return;
        case CimPackage.PERSON__LANDLINE_PHONE:
            unsetLandlinePhone();
            return;
        case CimPackage.PERSON__MOBILE_PHONE:
            unsetMobilePhone();
            return;
        case CimPackage.PERSON__ROLES:
            unsetRoles();
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
        case CimPackage.PERSON__FIRST_NAME:
            return isSetFirstName();
        case CimPackage.PERSON__LAST_NAME:
            return isSetLastName();
        case CimPackage.PERSON__MNAME:
            return isSetMName();
        case CimPackage.PERSON__PREFIX:
            return isSetPrefix();
        case CimPackage.PERSON__SPECIAL_NEED:
            return isSetSpecialNeed();
        case CimPackage.PERSON__SUFFIX:
            return isSetSuffix();
        case CimPackage.PERSON__ELECTRONIC_ADDRESS:
            return isSetElectronicAddress();
        case CimPackage.PERSON__LANDLINE_PHONE:
            return isSetLandlinePhone();
        case CimPackage.PERSON__MOBILE_PHONE:
            return isSetMobilePhone();
        case CimPackage.PERSON__ROLES:
            return isSetRoles();
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
        result.append( " (firstName: " );
        if( firstNameESet )
            result.append( firstName );
        else
            result.append( "<unset>" );
        result.append( ", lastName: " );
        if( lastNameESet )
            result.append( lastName );
        else
            result.append( "<unset>" );
        result.append( ", mName: " );
        if( mNameESet )
            result.append( mName );
        else
            result.append( "<unset>" );
        result.append( ", prefix: " );
        if( prefixESet )
            result.append( prefix );
        else
            result.append( "<unset>" );
        result.append( ", specialNeed: " );
        if( specialNeedESet )
            result.append( specialNeed );
        else
            result.append( "<unset>" );
        result.append( ", suffix: " );
        if( suffixESet )
            result.append( suffix );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PersonImpl
