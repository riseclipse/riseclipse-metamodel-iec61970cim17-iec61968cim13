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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovCT2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovCT2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovCT2ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovCT2ItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addAsetPropertyDescriptor( object );
            addDbPropertyDescriptor( object );
            addDmPropertyDescriptor( object );
            addFlim1PropertyDescriptor( object );
            addFlim10PropertyDescriptor( object );
            addFlim2PropertyDescriptor( object );
            addFlim3PropertyDescriptor( object );
            addFlim4PropertyDescriptor( object );
            addFlim5PropertyDescriptor( object );
            addFlim6PropertyDescriptor( object );
            addFlim7PropertyDescriptor( object );
            addFlim8PropertyDescriptor( object );
            addFlim9PropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKdgovPropertyDescriptor( object );
            addKigovPropertyDescriptor( object );
            addKiloadPropertyDescriptor( object );
            addKimwPropertyDescriptor( object );
            addKpgovPropertyDescriptor( object );
            addKploadPropertyDescriptor( object );
            addKturbPropertyDescriptor( object );
            addLdrefPropertyDescriptor( object );
            addMaxerrPropertyDescriptor( object );
            addMinerrPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPlim1PropertyDescriptor( object );
            addPlim10PropertyDescriptor( object );
            addPlim2PropertyDescriptor( object );
            addPlim3PropertyDescriptor( object );
            addPlim4PropertyDescriptor( object );
            addPlim5PropertyDescriptor( object );
            addPlim6PropertyDescriptor( object );
            addPlim7PropertyDescriptor( object );
            addPlim8PropertyDescriptor( object );
            addPlim9PropertyDescriptor( object );
            addPratePropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addRclosePropertyDescriptor( object );
            addRdownPropertyDescriptor( object );
            addRopenPropertyDescriptor( object );
            addRselectPropertyDescriptor( object );
            addRupPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTactPropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTdgovPropertyDescriptor( object );
            addTengPropertyDescriptor( object );
            addTfloadPropertyDescriptor( object );
            addTpelecPropertyDescriptor( object );
            addTsaPropertyDescriptor( object );
            addTsbPropertyDescriptor( object );
            addVmaxPropertyDescriptor( object );
            addVminPropertyDescriptor( object );
            addWfnlPropertyDescriptor( object );
            addWfspdPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_aset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_aset_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Aset(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_db_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_db_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Db(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_dm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_dm_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Dm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim1_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim10_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim10(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim2_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim3_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim4_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim5_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim6_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim7_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim8_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flim9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlim9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_flim9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_flim9_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Flim9(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ka feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_ka_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Ka(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kdgov feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdgovPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_kdgov_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_kdgov_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Kdgov(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kigov feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKigovPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_kigov_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_kigov_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Kigov(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kiload feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiloadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_kiload_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_kiload_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Kiload(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kimw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKimwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_kimw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_kimw_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Kimw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpgov feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpgovPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_kpgov_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_kpgov_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Kpgov(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpload feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKploadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_kpload_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_kpload_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Kpload(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_kturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_kturb_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Kturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ldref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLdrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_ldref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_ldref_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Ldref(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Maxerr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxerrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_maxerr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_maxerr_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Maxerr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Minerr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinerrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_minerr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_minerr_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Minerr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mwbase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwbasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_mwbase_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim1_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim10_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim10(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim2_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim3_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim4_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim5_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim6_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim7_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim8_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plim9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlim9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_plim9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_plim9_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Plim9(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Prate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPratePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_prate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_prate_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Prate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_r_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rclose feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRclosePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_rclose_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_rclose_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Rclose(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rdown feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRdownPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_rdown_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_rdown_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Rdown(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ropen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRopenPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_ropen_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_ropen_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Ropen(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rselect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRselectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_rselect_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_rselect_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Rselect(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rup feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRupPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_rup_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_rup_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Rup(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_ta_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tact feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTactPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_tact_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_tact_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Tact(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_tb_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Tb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_tc_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tdgov feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdgovPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_tdgov_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_tdgov_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Tdgov(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Teng feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTengPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_teng_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_teng_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Teng(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tfload feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfloadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_tfload_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_tfload_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Tfload(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpelec feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpelecPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_tpelec_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_tpelec_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Tpelec(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tsa feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTsaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_tsa_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_tsa_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Tsa(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tsb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTsbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_tsb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_tsb_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Tsb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_vmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_vmax_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Vmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_vmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_vmin_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Vmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wfnl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWfnlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_wfnl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_wfnl_feature", "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Wfnl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wfspd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWfspdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT2_wfspd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT2_wfspd_feature",
                                "_UI_GovCT2_type" ),
                        CimPackage.eINSTANCE.getGovCT2_Wfspd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovCT2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovCT2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovCT2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovCT2_type" )
                : getString( "_UI_GovCT2_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( GovCT2.class ) ) {
        case CimPackage.GOV_CT2__ASET:
        case CimPackage.GOV_CT2__DB:
        case CimPackage.GOV_CT2__DM:
        case CimPackage.GOV_CT2__FLIM1:
        case CimPackage.GOV_CT2__FLIM10:
        case CimPackage.GOV_CT2__FLIM2:
        case CimPackage.GOV_CT2__FLIM3:
        case CimPackage.GOV_CT2__FLIM4:
        case CimPackage.GOV_CT2__FLIM5:
        case CimPackage.GOV_CT2__FLIM6:
        case CimPackage.GOV_CT2__FLIM7:
        case CimPackage.GOV_CT2__FLIM8:
        case CimPackage.GOV_CT2__FLIM9:
        case CimPackage.GOV_CT2__KA:
        case CimPackage.GOV_CT2__KDGOV:
        case CimPackage.GOV_CT2__KIGOV:
        case CimPackage.GOV_CT2__KILOAD:
        case CimPackage.GOV_CT2__KIMW:
        case CimPackage.GOV_CT2__KPGOV:
        case CimPackage.GOV_CT2__KPLOAD:
        case CimPackage.GOV_CT2__KTURB:
        case CimPackage.GOV_CT2__LDREF:
        case CimPackage.GOV_CT2__MAXERR:
        case CimPackage.GOV_CT2__MINERR:
        case CimPackage.GOV_CT2__MWBASE:
        case CimPackage.GOV_CT2__PLIM1:
        case CimPackage.GOV_CT2__PLIM10:
        case CimPackage.GOV_CT2__PLIM2:
        case CimPackage.GOV_CT2__PLIM3:
        case CimPackage.GOV_CT2__PLIM4:
        case CimPackage.GOV_CT2__PLIM5:
        case CimPackage.GOV_CT2__PLIM6:
        case CimPackage.GOV_CT2__PLIM7:
        case CimPackage.GOV_CT2__PLIM8:
        case CimPackage.GOV_CT2__PLIM9:
        case CimPackage.GOV_CT2__PRATE:
        case CimPackage.GOV_CT2__R:
        case CimPackage.GOV_CT2__RCLOSE:
        case CimPackage.GOV_CT2__RDOWN:
        case CimPackage.GOV_CT2__ROPEN:
        case CimPackage.GOV_CT2__RSELECT:
        case CimPackage.GOV_CT2__RUP:
        case CimPackage.GOV_CT2__TA:
        case CimPackage.GOV_CT2__TACT:
        case CimPackage.GOV_CT2__TB:
        case CimPackage.GOV_CT2__TC:
        case CimPackage.GOV_CT2__TDGOV:
        case CimPackage.GOV_CT2__TENG:
        case CimPackage.GOV_CT2__TFLOAD:
        case CimPackage.GOV_CT2__TPELEC:
        case CimPackage.GOV_CT2__TSA:
        case CimPackage.GOV_CT2__TSB:
        case CimPackage.GOV_CT2__VMAX:
        case CimPackage.GOV_CT2__VMIN:
        case CimPackage.GOV_CT2__WFNL:
        case CimPackage.GOV_CT2__WFSPD:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
