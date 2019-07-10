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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroWEH;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroWEH} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydroWEHItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydroWEHItemProvider( AdapterFactory adapterFactory ) {
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

            addDbPropertyDescriptor( object );
            addDicnPropertyDescriptor( object );
            addDpvPropertyDescriptor( object );
            addDturbPropertyDescriptor( object );
            addFeedbackSignalPropertyDescriptor( object );
            addFl1PropertyDescriptor( object );
            addFl2PropertyDescriptor( object );
            addFl3PropertyDescriptor( object );
            addFl4PropertyDescriptor( object );
            addFl5PropertyDescriptor( object );
            addFp1PropertyDescriptor( object );
            addFp10PropertyDescriptor( object );
            addFp2PropertyDescriptor( object );
            addFp3PropertyDescriptor( object );
            addFp4PropertyDescriptor( object );
            addFp5PropertyDescriptor( object );
            addFp6PropertyDescriptor( object );
            addFp7PropertyDescriptor( object );
            addFp8PropertyDescriptor( object );
            addFp9PropertyDescriptor( object );
            addGmaxPropertyDescriptor( object );
            addGminPropertyDescriptor( object );
            addGtmxclPropertyDescriptor( object );
            addGtmxopPropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPmss1PropertyDescriptor( object );
            addPmss10PropertyDescriptor( object );
            addPmss2PropertyDescriptor( object );
            addPmss3PropertyDescriptor( object );
            addPmss4PropertyDescriptor( object );
            addPmss5PropertyDescriptor( object );
            addPmss6PropertyDescriptor( object );
            addPmss7PropertyDescriptor( object );
            addPmss8PropertyDescriptor( object );
            addPmss9PropertyDescriptor( object );
            addRpgPropertyDescriptor( object );
            addRppPropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTdvPropertyDescriptor( object );
            addTgPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addTpePropertyDescriptor( object );
            addTwPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_db_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_db_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Db(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dicn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDicnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_dicn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_dicn_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Dicn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dpv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_dpv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_dpv_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Dpv(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_dturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_dturb_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Dturb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Feedback Signal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeedbackSignalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_feedbackSignal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_feedbackSignal_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_FeedbackSignal(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fl1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFl1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fl1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fl1_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fl1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fl2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFl2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fl2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fl2_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fl2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fl3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFl3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fl3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fl3_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fl3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fl4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFl4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fl4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fl4_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fl4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fl5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFl5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fl5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fl5_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fl5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp1_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp10_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp10(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp2_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp3_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp4_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp5_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp6_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp7_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp7(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp8_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp8(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fp9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFp9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_fp9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_fp9_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Fp9(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gmax_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gmin_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gtmxcl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGtmxclPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gtmxcl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gtmxcl_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gtmxcl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gtmxop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGtmxopPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gtmxop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gtmxop_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gtmxop(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gv1_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gv1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gv2_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gv2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gv3_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gv3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gv4_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gv4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_gv5_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Gv5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_kd_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Kd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_ki_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Ki(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_kp_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Kp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_mwbase_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Mwbase(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss1_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss10_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss10(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss2_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss3_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss4_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss5_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss6_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss7_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss7(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss8_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss8(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmss9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmss9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_pmss9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_pmss9_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Pmss9(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rpg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRpgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_rpg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_rpg_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Rpg(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_rpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_rpp_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Rpp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Td feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_td_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Td(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tdv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_tdv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_tdv_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Tdv(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_tg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_tg_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Tg(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_tp_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Tp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tpe feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_tpe_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_tpe_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Tpe(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroWEH_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroWEH_tw_feature",
                                "_UI_GovHydroWEH_type" ),
                        CimPackage.eINSTANCE.getGovHydroWEH_Tw(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns GovHydroWEH.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydroWEH" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydroWEH ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydroWEH_type" )
                : getString( "_UI_GovHydroWEH_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydroWEH.class ) ) {
        case CimPackage.GOV_HYDRO_WEH__DB:
        case CimPackage.GOV_HYDRO_WEH__DICN:
        case CimPackage.GOV_HYDRO_WEH__DPV:
        case CimPackage.GOV_HYDRO_WEH__DTURB:
        case CimPackage.GOV_HYDRO_WEH__FEEDBACK_SIGNAL:
        case CimPackage.GOV_HYDRO_WEH__FL1:
        case CimPackage.GOV_HYDRO_WEH__FL2:
        case CimPackage.GOV_HYDRO_WEH__FL3:
        case CimPackage.GOV_HYDRO_WEH__FL4:
        case CimPackage.GOV_HYDRO_WEH__FL5:
        case CimPackage.GOV_HYDRO_WEH__FP1:
        case CimPackage.GOV_HYDRO_WEH__FP10:
        case CimPackage.GOV_HYDRO_WEH__FP2:
        case CimPackage.GOV_HYDRO_WEH__FP3:
        case CimPackage.GOV_HYDRO_WEH__FP4:
        case CimPackage.GOV_HYDRO_WEH__FP5:
        case CimPackage.GOV_HYDRO_WEH__FP6:
        case CimPackage.GOV_HYDRO_WEH__FP7:
        case CimPackage.GOV_HYDRO_WEH__FP8:
        case CimPackage.GOV_HYDRO_WEH__FP9:
        case CimPackage.GOV_HYDRO_WEH__GMAX:
        case CimPackage.GOV_HYDRO_WEH__GMIN:
        case CimPackage.GOV_HYDRO_WEH__GTMXCL:
        case CimPackage.GOV_HYDRO_WEH__GTMXOP:
        case CimPackage.GOV_HYDRO_WEH__GV1:
        case CimPackage.GOV_HYDRO_WEH__GV2:
        case CimPackage.GOV_HYDRO_WEH__GV3:
        case CimPackage.GOV_HYDRO_WEH__GV4:
        case CimPackage.GOV_HYDRO_WEH__GV5:
        case CimPackage.GOV_HYDRO_WEH__KD:
        case CimPackage.GOV_HYDRO_WEH__KI:
        case CimPackage.GOV_HYDRO_WEH__KP:
        case CimPackage.GOV_HYDRO_WEH__MWBASE:
        case CimPackage.GOV_HYDRO_WEH__PMSS1:
        case CimPackage.GOV_HYDRO_WEH__PMSS10:
        case CimPackage.GOV_HYDRO_WEH__PMSS2:
        case CimPackage.GOV_HYDRO_WEH__PMSS3:
        case CimPackage.GOV_HYDRO_WEH__PMSS4:
        case CimPackage.GOV_HYDRO_WEH__PMSS5:
        case CimPackage.GOV_HYDRO_WEH__PMSS6:
        case CimPackage.GOV_HYDRO_WEH__PMSS7:
        case CimPackage.GOV_HYDRO_WEH__PMSS8:
        case CimPackage.GOV_HYDRO_WEH__PMSS9:
        case CimPackage.GOV_HYDRO_WEH__RPG:
        case CimPackage.GOV_HYDRO_WEH__RPP:
        case CimPackage.GOV_HYDRO_WEH__TD:
        case CimPackage.GOV_HYDRO_WEH__TDV:
        case CimPackage.GOV_HYDRO_WEH__TG:
        case CimPackage.GOV_HYDRO_WEH__TP:
        case CimPackage.GOV_HYDRO_WEH__TPE:
        case CimPackage.GOV_HYDRO_WEH__TW:
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
